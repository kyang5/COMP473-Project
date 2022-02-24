package com.university.model.use;

// TODO: Add useStartTime, useEndTime, useStartDate, and UseEndDate attributes
//TODO: check to see if we need to add useLog and/or change it to listactual usage.

import com.university.model.facility.FacilityRoom;

import java.util.*;

public class UseSchedule {
    private boolean inUse;
    private int availableCapacity;
    private int occupancy;
    private boolean atCapacity;
    private int usage;
    private List<FacilityRoom> facilityRooms = new ArrayList<>();
    private Time useStartTime;
    private Time useEndTime;
    private Date useStartDate;
    private Date useEndDate;
    private List<Type> listActualUsage = new ArrayList<>();

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
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

    public int requestAvailableCapacity(FacilityRoom capacity) {
        return availableCapacity = capacity.getCapacity() - occupancy;
    }

    // get list of facility rooms
    public List<FacilityRoom> getFacilityRooms() {
        return facilityRooms;
    }

    public void setFacilityRooms(List<FacilityRoom> facilityRooms) {
        this.facilityRooms = facilityRooms;
    }

    // add facility room to list of facility rooms
    public void addFacilityRoom(FacilityRoom facilityRoom) {
        facilityRooms.add(facilityRoom);
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    // TODO complete method
    public void assignFacilityRoomToUse(FacilityRoom facilityRoom) {
        // add a facility room usage type to list of actual usage type

    }

    // TODO create list of users

    // TODO add method to add User

    // TODO complete method
    public void vacateFacilityRoom(User user) {
        // remove user from facility room

    }

    public List<Type> getListActualUsage() {
        return listActualUsage;
    }

    public void setListActualUsage(List<Type> listActualUsage) {
        this.listActualUsage = listActualUsage;
    }

    public void addActualUsage (Type facilityUseType) {
        listActualUsage.add(facilityUseType);
    }

    // TODO complete method
    public void calculateUsageRate() {
        // total count of use of room
    }

    public Date getUseStartDate() {
        return useStartDate;
    }

    public void setUseStartDate(Date useStartDate) {
        this.useStartDate = useStartDate;
    }

    public Date getUseEndDate() {
        return useEndDate;
    }

    public void setUseEndDate(Date useEndDate) {
        this.useEndDate = useEndDate;
    }

    public Time getUseStartTime() {
        return useStartTime;
    }

    public void setUseStartTime(Time useStartTime) {
        this.useStartTime = useStartTime;
    }

    public Time getUseEndTime() {
        return useEndTime;
    }

    public void setUseEndTime(Time useEndTime) {
        this.useEndTime = useEndTime;
    }

    // TODO complete method
    public void isInUseDuringTimeInterval() {
        //useStartTime, useEndTime
    }

    public void setInUseDuringTimeInterval() {

    }

    // TODO add method to calculate use start date and end date
     public void isInUseDuringDateInterval() {
        // useStartDate, useEndDate
     }



}
