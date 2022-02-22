package com.university.model.use;

// TODO: Create method to calculate if reaching capacity (capacity - occupancy)
// TODO: Make information from FacilityLocation or FacilityDetail available
// TODO: Add useStartTime, useEndTime, useStartDate, and UseEndDate attributes

public class UseSchedule {
    private boolean inUse;
    private int capacity;
    private int occupancy;
    private boolean atCapacity;
    private int usage;


    public boolean isInUse() {
        return inUse;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isAtCapacity() {
        return atCapacity;
    }

    public void requestAvailableCapacity() {

    }

    public int getUsage() {
        return usage;
    }

    public void isInUseDuringInterval() {
        //useStartTime, useEndTime
    }

    public void assignFacilityToUse() {

    }

    public void vacateFacility() {

    }

//TODO: Add listActualUsage() method

    public void calculateUsageRate() {

    }

    public void setInUseDuringInterval() {

    }
}
