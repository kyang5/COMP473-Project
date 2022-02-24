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
    private List<FacilityRoom> facilityDetails = new ArrayList<>();

    // TODO Pass in occupancy from FacilityRoom


    public boolean isInUse() {
        return inUse;
    }

    public boolean isAtCapacity() {
            return atCapacity;
    }

    public int requestAvailableCapacity(FacilityRoom capacity, int occupancy) {
        // return capacity - occupancy
        availableCapacity = capacity.getCapacity() - occupancy;
        return availableCapacity;
    }

    public List<FacilityRoom> getFacilityDetails() {
        return facilityDetails;
    }

    public void setFacilityDetails(List<FacilityRoom> facilityDetails) {
        this.facilityDetails = facilityDetails;
    }

    public void addFacilityDetail(FacilityRoom facilityDetail) {
        facilityDetails.add(facilityDetail);
    }

    public int getUsage() {
        return usage;
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
