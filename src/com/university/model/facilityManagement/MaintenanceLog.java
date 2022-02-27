package com.university.model.facilityManagement;

import com.university.model.facility.FacilityRoom;
import java.util.*;
//TODO address some questions about the list and calculations
public class MaintenanceLog {
    private double cost;
    private Date downTime;
    private List<FacilityRoom> facilityList = new ArrayList<FacilityRoom>();
    private List<MaintenanceOrder> maintenanceList = new ArrayList<MaintenanceOrder>();
    private List<MaintenanceWorker> workerList = new ArrayList<>();
    private List<MaintenanceRequest> requestList = new ArrayList<>();
    private FacilityRoom facilityRoom;
    private MaintenanceOrder maintenanceOrder;
    private MaintenanceWorker maintenanceWorker;
    private MaintenanceRequest maintenanceRequest;

    public FacilityRoom getFacilityRoom(){
        return facilityRoom;
    }
    public void setFacilityRoom(FacilityRoom facilityRoom){
        this.facilityRoom = facilityRoom;

    }
    public MaintenanceOrder getMaintenanceOrder(){
        return maintenanceOrder;
    }
    public void setMaintenanceOrder(MaintenanceOrder maintenanceOrder){
        this.maintenanceOrder = maintenanceOrder;
    }
    public MaintenanceWorker getMaintenanceWorker(){
        return maintenanceWorker;
    }
    public void setMaintenanceWorker(MaintenanceWorker maintenanceWorker) {
        this.maintenanceWorker = maintenanceWorker;
    }
    public MaintenanceRequest getMaintenanceRequest(){
        return maintenanceRequest;
    }
    public void setMaintenanceWorker(MaintenanceRequest maintenanceRequest) {
        this.maintenanceRequest = maintenanceRequest;
    }
    public List<FacilityRoom> getFacilityList() {
        return facilityList;
    }

    public void setFacilityList(List<FacilityRoom> facilityList) {
        this.facilityList = facilityList;
    }
    public List<MaintenanceOrder> getMaintenanceList() {
        return maintenanceList;
    }

    public void setMaintenanceList(List<MaintenanceOrder> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }
    public List<MaintenanceWorker> getWorkerList() {
        return workerList;
    }

    public void setWorkerList(List<MaintenanceWorker> workerList) {
        this.workerList = workerList;
    }
    public List<MaintenanceRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(List<MaintenanceRequest> requestList) {
        this.requestList = requestList;
    }
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
    public double calcMaintenanceCostForFacility(){
        //TODO enter the method for the calculations
        //TODO check orderdetail order and product as a frame of reference for bookstore
        double total = 0.0;
        for (MaintenanceRequest totalSum : maintenanceList) {
            total += totalSum.getProduct().getPrice() * totalSum.getQuantity();
        }
        return total;
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
