package com.university.model.use;

public class UseSchedule {
    private boolean inUse;
    private int capacity;
    private boolean atCapacity;
    private int usage;
    // useStartTime
    // useEndTime

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

    // listActualUsage(), delete or move to different class?

    public void calculateUsageRate() {

    }

    public void setInUseDuringInterval() {

    }
}
