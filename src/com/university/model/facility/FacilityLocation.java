package com.university.model.facility;

// TO DO: Figure out add FacilityDetail & FacilityManager to facilities list.

import java.util.List;
import java.util.ArrayList;

public class FacilityLocation {
    private String name;
    private int addressNumber;
    private String streetName;
    private String city;
    private int zipcode;
    private FacilityManager facilityManager;
    private List<FacilityDetail> facilityDetails = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(int addressNumber) {
        this.addressNumber = addressNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public List<FacilityDetail> getFacilityDetails() {
        return facilityDetails;
    }

    public void setFacilityDetails(List<FacilityDetail> facilityDetails) {
        this.facilityDetails = facilityDetails;
    }

    public void addFacilityDetail(FacilityDetail facilityDetail) {
        facilityDetails.add(facilityDetail);
    }

    public FacilityManager getFacilityManager() {
        return facilityManager;
    }

    public void setFacilityManager(FacilityManager facilityManager) {
        this.facilityManager = facilityManager;
    }
}