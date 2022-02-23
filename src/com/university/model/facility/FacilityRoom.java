package com.university.model.facility;

// TO DO: Extends FacilityLocation

public class FacilityRoom extends FacilityLocation {
    private int phoneNumber;
    private int facilityId;
    private int roomNumber;

    public FacilityRoom (int phoneNumber, int facilityId, int roomNumber) {
        this.phoneNumber = phoneNumber;
        this.facilityId = facilityId;
        this.roomNumber = roomNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}