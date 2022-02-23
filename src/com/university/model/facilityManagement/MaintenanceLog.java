package com.university.model.facilityManagement;

import com.university.model.facility.FacilityRoom;
import java.util.*;

public class MaintenanceLog {
    private double cost;
    private Date downTime;
    private List<FacilityRoom> maintenanceList = new ArrayList<FacilityRoom>();

    public double getCost(){
        return cost;
    }
    public Date getDownTime(){
        //TODO check to see if this needs to be public void
        return downTime;
    }
    public void setCost(int cost){
        this.cost =cost;

    }
    public void setDownTime(Date downTime){
        this.downTime = downTime;
    }
    public int calcMaintenanceCostForFacility(){
        //TODO enter the method for the calculations
        //TODO check orderdetail order and product as a frame of reference for bookstore
    }
    public void calcDownTimeForFacility(){
        //TODO enter the method. Decide whether we need Time or Date as the value
    }
    public void listMaintenance(){
        //TODO decide on the return value and calculations etc.
        //TODO write arraylist of maintencance list and details
    }
    public void addMaintOrder(){
        //TODO add values from MaintOrder

    }
    public void addMaintWorker(){

    }
    public void removeMaintWorker(){
        //TODO add values for MaintWorker
    }
    public void addMaintRequest(){
        //TODO add values for addMaintRequest
    }
    public void addMaintSchedule(){
        //TODO add values for addMaintSchedule
    }
    public void addInspection(Inspection addInspection){
        addInspections.add(addInspection);
        //Make it a Inspection list?
        //add to maintenance.
    }
}
