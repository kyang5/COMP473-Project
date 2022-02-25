package com.university.model.facility;

public class FacilityRoom {
    private int phoneNumber;
    private int facilityRoomId;
    private int roomNumber;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getFacilityRoomId() {
        return facilityRoomId;
    }

    public void setFacilityRoomId(int facilityId) {
        this.facilityRoomId = facilityId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}