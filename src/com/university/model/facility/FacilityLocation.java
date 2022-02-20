package com.university.model.facility;

// TO DO: Figure out add FacilityDetail & FacilityManager to facilities list.

import java.util.List;
import java.util.ArrayList;

public class FacilityLocation {
    private String name;
    private Integer addressNumber;
    private String streetName;
    private String city;
    private Integer zipcode;
    private List<Object> facilities = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAddressNumber() {
        return addressNumber;
    }

    public void setAddressNumber(Integer addressNumber) {
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

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public List<Object> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Object> facilities) {
        this.facilities = facilities;
    }

    public void addFacility() {
    }
}