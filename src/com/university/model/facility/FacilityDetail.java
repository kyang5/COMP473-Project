package com.university.model.facility;

public class FacilityDetail {
    private Integer phoneNumber;
    private Integer facilityId;
    private Integer roomNumber;

    public FacilityDetail (Integer phoneNumber, Integer facilityId, Integer roomNumber) {
        this.phoneNumber = phoneNumber;
        this.facilityId = facilityId;
        this.roomNumber = roomNumber;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Integer facilityId) {
        this.facilityId = facilityId;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
}