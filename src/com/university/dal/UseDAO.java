package com.university.dal;

import com.university.model.facility.FacilityRoom;
import com.university.model.use.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseDAO {

    public User getUser(String userId) {

        private String userFirstName;
        private String userLastName;
        private int userId;
        private String userTitle;
        private FacilityRoom facilityRoom;

        try {
            //Get user
            Statement st = DbHelper.getConnection().createStatement();
            String selectUserQuery = "SELECT userID, userFirstName, userLastName, userTitle FROM User WHERE userId = '" + userId + "'";

            ResultSet userRS = st.executeQuery(selectUserQuery);
            System.out.println("CustomerDAO: *************** Query " + selectUserQuery);

            //Get user
            User user = new User();
            while(userRS.next()) {

            }
        }
    }
}
