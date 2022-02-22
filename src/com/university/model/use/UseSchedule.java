package com.university.model.use;

// TODO: Add useStartTime, useEndTime, useStartDate, and UseEndDate attributes
// TODO: Consider moving capacity and occupancy to FacilityDetail

import com.university.model.facility.FacilityDetail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UseSchedule {
    private boolean inUse;
    private int capacity;
    private int occupancy;
    private boolean atCapacity;
    private int usage;
    private List<FacilityDetail> facilityDetails = new ArrayList<>();
    //private Time useStartTime;
    //private Time useEndTime;
    private Date useStartDate;
    private Date useEndDate;
    private int useLog;
    private User user;


    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAtCapacity() {
        return atCapacity;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public void requestAvailableCapacity() {
    // TODO: Calculate capacity - occupancy
    }

    public List<FacilityDetail> getFacilityDetails() {
        return facilityDetails;
    }

    public void setFacilityDetails(List<FacilityDetail> facilityDetails) {
        this.facilityDetails = facilityDetails;
    }

    public void assignFacilityDetailToUse(FacilityDetail facilityDetail) {
        facilityDetails.add(facilityDetail);
    }

    public void removeFacilityDetail(FacilityDetail facilityDetail) {
        facilityDetails.remove(facilityDetail);
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addUser(User user) {
    // TODO: make a list of users?
    }

    public void removeUser(User user) {

    }

    public void listActualUsage() {
    // TODO: make a list of how rooms in facility are being used?
    }

    public void calculateUsageRate() {
    // TODO: Calculate usage rate
    }

// TODO: Add methods for use times and use dates

    public void isInUseDuringInterval() {
    // TODO: Calculate duration room in facility is being used
    }

    public void setInUseDuringInterval() {
    // TODO: Set to in use during time interval
    }

    public int getUseLog() {
        return useLog;
    }

    public void setUseLog(int useLog) {
        this.useLog = useLog;
    }
}
