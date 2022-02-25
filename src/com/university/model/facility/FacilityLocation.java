package com.university.model.facility;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class FacilityLocation {
    private int facilityId;
    private String name;
    private int addressNumber;
    private String streetName;
    private String city;
    private int zipcode;
    private int capacity;
    private FacilityManager facilityManager;
    private List<FacilityLocation> listFacilities = new ArrayList<>();

    public int getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(int facilityId) {
        this.facilityId = facilityId;
    }

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<FacilityLocation> getListFacilities() {
        return listFacilities;
    }

    public void setListFacilities(List<FacilityLocation> listFacilities) {
        this.listFacilities = listFacilities;
    }

    public void addFacilityLocation (FacilityLocation facility) {
        listFacilities.add(facility);
    }

    public void removeFacilityLocation (FacilityLocation facilityLocation) {
        listFacilities.remove(facilityLocation);
    }

    public FacilityManager getFacilityManager() {
        return facilityManager;
    }

    public void setFacilityManager(FacilityManager facilityManager) {
        this.facilityManager = facilityManager;
    }

}