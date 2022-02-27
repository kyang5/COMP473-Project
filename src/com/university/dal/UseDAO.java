package com.university.dal;

import com.university.model.facility.FacilityRoom;
import com.university.model.use.Type;
import com.university.model.use.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseDAO {

    public User getUser(String userId) {

        try {
            //Get user
            Statement st = DbHelper.getConnection().createStatement();
            String selectUserQuery = "SELECT userID, userFirstName, userLastName, userTitle FROM User WHERE userId = '" + userId + "'";

            ResultSet userRS = st.executeQuery(selectUserQuery);
            System.out.println("UseDAO: *************** Query " + selectUserQuery);

            //Get user
            User user = new User();
            while(userRS.next()) {
                user.setUserId(userRS.getString("userID"));
                user.setUserFirstName(userRS.getString("userFirstName"));
                user.setUserLastName(userRS.getString("userLastName"));
                user.setUserTitle(userRS.getString("userTitle"));
            }
            userRS.close();

            //Get facility room
            String selectFacilityRoomQuery = "SELECT facilityRoomID, phoneNumber, roomNumber, capacity FROM FacilityRoom WHERE userID = '" + userId + "'";
            ResultSet facilityRoomRS = st.executeQuery(selectFacilityRoomQuery);
            FacilityRoom facilityRoom = new FacilityRoom;

            System.out.println("UserDAO: *************** Query " + selectFacilityRoomQuery);

            while (facilityRoomRS.next()) {
                facilityRoom.setFacilityRoomId(facilityRoomRS.getString("facilityRoomID"));
                facilityRoom.setPhoneNumber(facilityRoomRS.getString("phoneNumber"));
                facilityRoom.setRoomNumber(facilityRoomRS.getString("roomNumber"));
                facilityRoom.setCapacity(facilityRoomRS.getString("capacity"));
            }
            facilityRoomRS.close();
            st.close();

            return user;
        }
        catch (SQLException se) {
            System.err.println("UserDAO: Threw a SQLException retrieving the user object.");
            System.err.println(se.getMessage());
            se.printStackTrace();
        }

        return null;
    }

    public void addUser(User user) {
        Connection con = DBHelper.getConnection();
        PreparedStatement userPst = null;
        PreparedStatement facilityRoomPst = null;

        try{
            String userStm = "INSERT INTO User(userID, userFirstName, userLastName, userTitle) VALUES(?, ?, ?, ?)";
            userPst.setString(1, user.getUserId());
            userPst.setString(2, user.getUserFirstName());
            userPst.setString(3, user.getUserLastName());
            userPst.setString(4, user.getUserTitle());
            userPst.executeUpdate();

            String facilityRoomStm = "INSERT INTO FacilityRoom(userID, facilityRoomID, phoneNumber, roomNumber, capacity) VALUES(?, ?, ?, ?, ?)";
            facilityRoomPst = con.prepareStatement(facilityRoomStm);
            facilityRoomPst.setString(1, user.getUserId());
            facilityRoomPst.setString(2, user.getFacilityRoom().getFacilityRoomId());
            facilityRoomPst.setString(3, user.getFacilityRoom().getPhoneNumber());
            facilityRoomPst.setString(4, user.getFacilityRoom().getRoomNumber());
            facilityRoomPst.setString(5, user.getFacilityRoom().getCapacity());
            facilityRoomPst.executeUpdate();
        } catch (SQLException ex) {

        } finally {

            try {
                if (facilityRoomPst != null) {
                    facilityRoomPst.close();
                    userPst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.err.println("UserDAO: Threw a SQLException saving the user object.");
                System.err.println(ex.getMessage());
            }
        }
    }

    public Type getFacilityUseType(String facilityUseType) {

        try {
            Statement st = DbHelper.getConnection().createStatement();
            String selectFacilityUseTypeQuery = "SELECT facilityUseType FROM Type WHERE facilityUseType = '" + facilityUseType + "'";

            ResultSet facilityUseTypeRS = st.executeQuery(selectFacilityUseTypeQuery);
            System.out.println("UseDAO: *************** Query " + selectFacilityUseTypeQuery);


            User user = new User();
            Type facilityUseType = new Type();
            while(facilityUseType.next()) {
                facilityUseType.setFacilityUseType(facilityUseTypeRS.getString("facilityUseType"));
            }
            facilityUseTypeRS.close();

            //Get facility room
            String selectFacilityRoomQuery = "SELECT facilityRoomID, phoneNumber, roomNumber, capacity FROM FacilityRoom WHERE userID = '" + userId + "'";
            ResultSet facilityRoomRS = st.executeQuery(selectFacilityRoomQuery);
            FacilityRoom facilityRoom = new FacilityRoom;

            System.out.println("UserDAO: *************** Query " + selectFacilityRoomQuery);

            while (facilityRoomRS.next()) {
                facilityRoom.setFacilityRoomId(facilityRoomRS.getString("facilityRoomID"));
                facilityRoom.setPhoneNumber(facilityRoomRS.getString("phoneNumber"));
                facilityRoom.setRoomNumber(facilityRoomRS.getString("roomNumber"));
                facilityRoom.setCapacity(facilityRoomRS.getString("capacity"));
            }
            facilityRoomRS.close();
            st.close();

            return facilityUseType;
        }
        catch (SQLException se) {
            System.err.println("UserDAO: Threw a SQLException retrieving the type object.");
            System.err.println(se.getMessage());
            se.printStackTrace();
        }

        return null;
    }

    public void addFacilityUseType(Type facilityUseType) {
        Connection con = DBHelper.getConnection();
        PreparedStatement facilityUseTypePst = null;
        PreparedStatement facilityRoomPst = null;

        try{
            String facilityUseTypeStm = "INSERT INTO Type(facilityUseType) VALUES(?)";
            facilityUseTypePst.setString(1, facilityUseType.getFacilityUseType());
            facilityUseTypePst.executeUpdate();

            String facilityRoomStm = "INSERT INTO FacilityRoom(facilityUseType, facilityRoomID, phoneNumber, roomNumber, capacity) VALUES(?, ?, ?, ?, ?)";
            facilityRoomPst = con.prepareStatement(facilityRoomStm);
            facilityRoomPst.setString(1, facilityUseType.getFacilityUseType());
            facilityRoomPst.setString(2, facilityUseType.getFacilityRoom().getFacilityRoomId());
            facilityRoomPst.setString(3, facilityUseType.getFacilityRoom().getPhoneNumber());
            facilityRoomPst.setString(4, facilityUseType.getFacilityRoom().getRoomNumber());
            facilityRoomPst.setString(5, facilityUseType.getFacilityRoom().getCapacity());
            facilityRoomPst.executeUpdate();
        } catch (SQLException ex) {

        } finally {

            try {
                if (facilityRoomPst != null) {
                    facilityRoomPst.close();
                    facilityUseTypePst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException ex) {
                System.err.println("UserDAO: Threw a SQLException saving the type object.");
                System.err.println(ex.getMessage());
            }
        }
    }
}