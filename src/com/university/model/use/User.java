package com.university.model.use;

import com.university.model.facility.FacilityRoom;

public class User {

    private String userFirstName;
    private String userLastName;
    private int userId;
    private String userTitle;
    private Type useType;

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public Type getUseType() {
        return useType;
    }

    public void setUseType(Type useType) {
        this.useType = useType;
    }
}
