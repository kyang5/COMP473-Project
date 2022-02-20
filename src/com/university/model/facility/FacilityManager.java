package com.university.model.facility;

public class FacilityManager {
    private String managerFirstName;
    private String managerLastName;
    private Integer managerId;

    public FacilityManager(String managerFirstName, String managerLastName, Integer managerId) {
        this.managerFirstName = managerFirstName;
        this.managerLastName = managerLastName;
        this.managerId = managerId;
    }

    public String getManagerFirstName() {
        return managerFirstName;
    }

    public void setManagerFirstName(String managerFirstName) {
        this.managerFirstName = managerFirstName;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public void setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }
}