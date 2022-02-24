package com.university.model.use;

// TODO: Create method to calculate if reaching capacity (capacity - occupancy)
// TODO: Make information from FacilityLocation or FacilityRoom available
// TODO: Add useStartTime, useEndTime, useStartDate, and UseEndDate attributes
//TODO: check to see if we need to add useLog and/or change it to listactual usage.

import com.university.model.facility.FacilityRoom;

import java.util.ArrayList;
import java.util.List;

public class UseSchedule {
    private boolean inUse;
    private int occupancy;
    private int availableCapacity;
    private boolean atCapacity;
    private int usage;
    private List<FacilityRoom> facilityRooms = new ArrayList<>();

    // TODO Pass in occupancy from FacilityRoom


    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    public boolean isAtCapacity() {
            return atCapacity;
    }

    public void setAtCapacity(boolean atCapacity) {
        this.atCapacity = atCapacity;
    }

    public int requestAvailableCapacity(FacilityRoom capacity, int occupancy) {
        return availableCapacity = capacity.getCapacity() - occupancy;
    }

    public List<FacilityRoom> getFacilityRooms() {
        return facilityRooms;
    }

    public void setFacilityRooms(List<FacilityRoom> facilityRooms) {
        this.facilityRooms = facilityRooms;
    }

    public void addFacilityDetail(FacilityRoom facilityRoom) {
        facilityRooms.add(facilityRoom);
    }

    public int getUsage() {
        return usage;
    }

    public void setUsage(int usage) {
        this.usage = usage;
    }

    public void assignFacilityToUse() {
        // add to list of actual usage
    }

    public void vacateFacility() {
        // remove user from facility
    }

//TODO: Add listActualUsage() method
    // get list of all usage types for each facility room

    public void calculateUsageRate() {
        // total count of use of room
    }

    public void isInUseDuringInterval() {
        //useStartTime, useEndTime
    }

    public void setInUseDuringInterval() {

    }
}
