package com.university.model.use;

// TODO: Create method to calculate if reaching capacity (capacity - occupancy)
// TODO: Make information from FacilityLocation or FacilityDetail available
// TODO: Add useStartTime, useEndTime, useStartDate, and UseEndDate attributes

import com.university.model.facility.FacilityRoom;

import java.util.ArrayList;
import java.util.List;

public class UseSchedule {
    private boolean inUse;
    private int capacity;
    private int occupancy;
    private boolean atCapacity;
    private int usage;
    private List<FacilityRoom> facilityDetails = new ArrayList<>();


    public boolean isInUse() {
        return inUse;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isAtCapacity() {
        return atCapacity;
    }

    public void requestAvailableCapacity() {

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

    }

    public void vacateFacility() {

    }

//TODO: Add listActualUsage() method

    public void calculateUsageRate() {

    }

    public void isInUseDuringInterval() {
        //useStartTime, useEndTime
    }

    public void setInUseDuringInterval() {

    }
}
