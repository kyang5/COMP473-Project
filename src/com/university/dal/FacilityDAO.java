package com.university.dal;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacilityDAO {

    public FacilityLocation getFacilityLocation(String facilityId) {
        try {
            // Get facility location
            Statement st = DBHelper.getConnection().createStatement();
            String selectFacilityLocationQuery = "SELECT facilityID, name, addressNumber, streetName, city, zipcode FROM FacilityLocation WHERE facilityId = '" + facilityId + "'";

            ResultSet facilityLocationRS = st.executeQuery(selectFacilityLocationQuery);
            System.out.println("FacilityDAO: *************** Query " + selectFacilityLocationQuery);

            //Get facility location
            FacilityLocation facilityLocation = new FacilityLocation();
            while (facilityLocationRS.next()) {
                facilityLocation.setFacilityId(facilityLocationRS.getString("facilityID"));
                facilityLocation.setName(facilityLocationRS.getString("name"));
                facilityLocation.setAddressNumber(facilityLocationRS.getString("addressNumber"));
                facilityLocation.setStreetName(facilityLocationRS.getString("streetName"));
                facilityLocation.setCity(facilityLocationRS.getString("city"));
                facilityLocation.setZipcode(facilityLocationRS.getString("zipcode"));

            }
            //close to manage resources
            facilityLocationRS.close();

            //Get facility manager
            String selectFacilityManagerQuery = "SELECT managerID, managerFirstName, managerLastName FROM FacilityManager WHERE managerID = '" + managerId + "'";
            ResultSet facilityManagerRS = st.executeQuery(selectFacilityManagerQuery);
            FacilityManager manager = new FacilityManager();

            System.out.println("FacilityDAO: *************** Query " + selectFacilityManagerQuery);

            while (facilityManagerRS.next()) {
                manager.setManagerId(facilityManagerRS.getString("managerID"));
                manager.setManagerFirstName(facilityManagerRS.getString("managerFirstName"));
                manager.setManagerLastName(facilityManagerRS.getString("managerLastName"));
            }

            //close to manage resources
            facilityManagerRS.close();
            st.close();

            return facilityLocation;
        }

            catch (SQLException se) {
                System.err.println("FacilityDAO: Threw a SQLException retrieving the facility location object.");
                System.err.println(se.getMessage());
                se.printStackTrace();
            }

            return null;
        }

    public void addFacilityLocation(FacilityLocation facilityLocation) {
        Connection con = DBHelper.getConnection();
        PreparedStatement facilityLocationPst = null;
        PreparedStatement managerPst = null;

        try {
            //Insert the facilityLocation object
            String facilityLocationStm = "INSERT INTO FacilityLocation(facilityID, name, addressName, streetName, city, zipcode) VALUES(?, ?, ?, ?, ?, ?)";
            facilityLocationPst = con.prepareStatement(facilityLocationStm);
            facilityLocationPst.setString(1, facilityLocation.getFacilityId());
            facilityLocationPst.setString(2, facilityLocation.getName());
            facilityLocationPst.setString(3, facilityLocation.getAddressNumber());
            facilityLocationPst.setString(4, facilityLocation.getStreetName());
            facilityLocationPst.setString(5, facilityLocation.getCity());
            facilityLocationPst.setString(6, facilityLocation.getZipcode());
            facilityLocationPst.executeUpdate();

            //Insert facility manager object
            String managerStm = "INSERT INTO FacilityManager(facilityID, managerID, managerFirstName, managerLastName) VALUES(?, ?, ?, ?)";
            managerPst = con.prepareStatement(managerStm);
            managerPst.setString(1, facilityLocation.getFacilityId());
            managerPst.setString(2, facilityLocation.getFacilityManager().getManagerId());
            managerPst.setString(3, facilityLocation.getFacilityManager().getManagerFirstName());
            managerPst.setString(4, facilityLocation.getFacilityManager().getManagerLastName());
            managerPst.executeUpdate();
        } catch (SQLException ex) {

        } finally {
            try {
                if(managerPst != null) {
                    managerPst.close();
                    facilityLocationPst.close();
                } if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.err.println("FacilityDAO: Threw a SQLException saving the facility location object.");
                System.err.println(ex.getMessage());
            }
        }
    }
}