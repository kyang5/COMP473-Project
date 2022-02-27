package com.university.dal;
import com.university.model.facilityManagement.Inspection;
import com.university.model.facilityManagement.Inspector;
import com.university.model.facilityManagement.MaintenanceLog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class MaintenanceDAO {
    public MaintenanceDAO(){

    }
    public Inspection getInspection(int inspectionID){
        try {
        //Get Customer
        Statement st = DBHelper.getConnection().createStatement();
        String selectInspectionQuery = "SELECT inspectionID, inspectionName, inspectionLog FROM Inspection WHERE inspectionID = '" + inspectionID + "'";

        ResultSet inspectionRS = st.executeQuery(selectInspectionQuery);
        System.out.println("MaintenanceDAO: *************** Query " + selectInspectionQuery);

        //Get Inspection
        Inspection inspection = new Inspection();
        while (inspectionRS.next() ) {
            inspection.setInspectionID(inspectionRS.getInt("inspectionID"));
            inspection.setInspectionName(inspectionRS.getString("inspectionName"));
            inspection.setInspectionLog(inspectionRS.getInt("inspectionLog"));
        }
        //close to manage resources
        inspectionRS.close();

        //Get Inspector
        String selectInspectorQuery = "SELECT inspectorID, firstName, lastName, title FROM Inspector WHERE inspectionID = '" + inspectionID + "'";
        ResultSet inspectorRS = st.executeQuery(selectInspectorQuery);
        Inspector inspector = new Inspector();

        System.out.println("MaintenanceDAO: *************** Query " + selectInspectorQuery);

        while (inspectorRS.next() ) {
            inspector.setInspectorID(inspectorRS.getInt("inspectorID"));
            inspector.setInspectorFirstName(inspectorRS.getString("firstName"));
            inspector.setInspectorLastName(inspectorRS.getString("lastName"));
            inspector.setInspectorTitle(inspectorRS.getString("title"));
        }

        //close to manage resources
            inspectorRS.close();
        st.close();

        return inspection;
    }
        catch (SQLException se) {
        System.err.println("MaintenanceDAO: Threw a SQLException retrieving the customer object.");
        System.err.println(se.getMessage());
        se.printStackTrace();
    }

        return null;
}

    public void addInspection(Inspection inspect) {
        Connection con = DBHelper.getConnection();
        PreparedStatement inspectPst = null;
        PreparedStatement inspectorPst = null;

        try {
            //Insert the customer object
            String inspectStm = "INSERT INTO Inspection(inspectionID, inspectionName, inspectionLog) VALUES(?, ?, ?)";
            inspectPst = con.prepareStatement(inspectStm);
            inspectPst.setInt(1, inspect.getInspectionID());
            inspectPst.setString(2, inspect.getInspectionName());
            inspectPst.setInt(3, inspect.getInspectionLog());
            inspectPst.executeUpdate();

            //Insert the customer address object
            String inspectorStm = "INSERT INTO Inspector(inspectionID, inspectorID, firstName, lastName, title) VALUES(?, ?, ?, ?, ?, ?, ?)";
            inspectorPst = con.prepareStatement(inspectorStm);
            inspectorPst.setInt(1, inspect.getInspectionID());
            inspectorPst.setInt(2, inspect.getInspector().getInspectorID());
            inspectorPst.setString(3, inspect.getInspector().getInspectorFirstName());
            inspectorPst.setString(4, inspect.getInspector().getInspectorLastName());
            inspectorPst.setString(5, inspect.getInspector().getInspectorTitle());

            inspectorPst.executeUpdate();
        } catch (SQLException ex) {

        } finally {

            try {
                if (inspectorPst != null) {
                    inspectorPst.close();
                    inspectPst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                System.err.println("MaintenanceDAO: Threw a SQLException saving the customer object.");
                System.err.println(ex.getMessage());
            }
        }
    }
    public MaintenanceLog getMaintenanceLog(Date downTime) {

        try {
            //Get Customer
            Statement st = DBHelper.getConnection().createStatement();
            String selectMaintenanceQuery = "SELECT downTime, cost FROM Customer WHERE downTime = '" + downTime + "'";

            ResultSet maintenanceRS = st.executeQuery(selectMaintenanceQuery);
            System.out.println("MaintenanceDAO: *************** Query " + selectMaintenanceQuery);

            //Get Customer
            MaintenanceLog maintenanceLog = new MaintenanceLog();
            while ( maintenanceRS.next() ) {
                //TDO Fix this.
                maintenanceLog.setDownTime(maintenanceRS.getDate("customerID"));
                maintenanceLog.setCost(maintenanceRS.getInt("cost"));
                MaintenanceLog.setFirstName(maintenanceRS.getString("fname"));
            }
            //close to manage resources
            custRS.close();

            //Get Address
            String selectAddressQuery = "SELECT addressID, street, unit, city, state, zip FROM Address WHERE customerID = '" + customerId + "'";
            ResultSet addRS = st.executeQuery(selectAddressQuery);
            Address address = new Address();

            System.out.println("CustomerDAO: *************** Query " + selectAddressQuery);

            while (addRS.next() ) {
                address.setAddressId(addRS.getString("addressid"));
                address.setStreet(addRS.getString("street"));
                address.setUnit(addRS.getString("unit"));
                address.setCity(addRS.getString("city"));
                address.setState(addRS.getString("state"));
                address.setZip(addRS.getString("zip"));
            }

            customer.setBillingAddress(address);
            //close to manage resources
            addRS.close();
            st.close();

            return customer;
        }
        catch (SQLException se) {
            System.err.println("CustomerDAO: Threw a SQLException retrieving the customer object.");
            System.err.println(se.getMessage());
            se.printStackTrace();
        }

        return null;
    }

    public void addCustomer(Customer cust) {
        Connection con = DBHelper.getConnection();
        PreparedStatement custPst = null;
        PreparedStatement addPst = null;

        try {
            //Insert the customer object
            String custStm = "INSERT INTO Customer(customerID, lname, fname) VALUES(?, ?, ?)";
            custPst = con.prepareStatement(custStm);
            custPst.setString(1, cust.getCustomerId());
            custPst.setString(2, cust.getLastName());
            custPst.setString(3, cust.getFirstName());
            custPst.executeUpdate();

            //Insert the customer address object
            String addStm = "INSERT INTO Address(customerID, addressID, street, unit, city, state, zip) VALUES(?, ?, ?, ?, ?, ?, ?)";
            addPst = con.prepareStatement(addStm);
            addPst.setString(1, cust.getCustomerId());
            addPst.setString(2, cust.getBillingAddress().getAddressId());
            addPst.setString(3, cust.getBillingAddress().getStreet());
            addPst.setString(4, cust.getBillingAddress().getUnit());
            addPst.setString(5, cust.getBillingAddress().getCity());
            addPst.setString(6, cust.getBillingAddress().getState());
            addPst.setString(7, cust.getBillingAddress().getZip());
            addPst.executeUpdate();
        } catch (SQLException ex) {

        } finally {

            try {
                if (addPst != null) {
                    addPst.close();
                    custPst.close();
                }
                if (con != null) {
                    con.close();
                }

            } catch (SQLException ex) {
                System.err.println("CustomerDAO: Threw a SQLException saving the customer object.");
                System.err.println(ex.getMessage());
            }
        }
    }
}

