package com.university.dal;
import com.university.model.facilityManagement.Inspection;
import com.university.model.facilityManagement.Inspector;
import com.university.model.facilityManagement.MaintenanceLog;
import com.university.model.facilityManagement.MaintenanceOrder;

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
            //inspection.setInspectionLog(inspectionRS.getInt("inspectionLog"));
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
            String inspectStm = "INSERT INTO Inspection(inspectionID, inspectionName) VALUES(?, ?, ?)";
            inspectPst = con.prepareStatement(inspectStm);
            inspectPst.setInt(1, inspect.getInspectionID());
            inspectPst.setString(2, inspect.getInspectionName());
            //inspectPst.setInt(3, inspect.getInspectionLog());
            inspectPst.executeUpdate();

            String inspectorStm = "INSERT INTO Inspection(inspectionID, inspectorID, firstName, lastName, title) VALUES(?, ?, ?, ?, ?, ?, ?)";
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
    public MaintenanceOrder getMaintenanceOrder(int orderID) {

        try {

            Statement st = DBHelper.getConnection().createStatement();
            String selectMaintenanceOrderQuery = "SELECT orderID, orderType, orderDate, cost FROM MaintenanceOrder WHERE orderID = '" + orderID + "'";

            ResultSet maintenanceOrderRS = st.executeQuery(selectMaintenanceOrderQuery);
            System.out.println("MaintenanceDAO: *************** Query " + selectMaintenanceOrderQuery);

            //Get Customer
            MaintenanceOrder maintenanceOrder = new MaintenanceOrder();
            while ( maintenanceOrderRS.next() ) {
                //TDO Fix this.
                maintenanceOrder.setOrderID(maintenanceOrderRS.getInt("orderID"));
                maintenanceOrder.setCost(maintenanceOrderRS.getDouble("cost"));
                maintenanceOrder.setOrderType(maintenanceOrderRS.getString("orderType"));
                maintenanceOrder.setOrderDate(maintenanceOrderRS.getDate("orderDate"));

            }
            //close to manage resources
            maintenanceOrderRS.close();


            String selectMaintenanceRoomQuery = "SELECT orderID, orderType, orderDate, cost FROM MaintenanceOrder WHERE orderID = '" + orderID + "'";
            ResultSet maintRoomRS = st.executeQuery(selectMaintenanceRoomQuery);
            Address address = new Address();

            System.out.println("MaintenanceDAO: *************** Query " + selectMaintenanceRoomQuery);

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

