package com.university.model.facilityManagement;

import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityRoom;
import java.util.*;
//TODO address some questions about the list and calculations
//TODO update documentation and UML Diagram for Objects and Lists.
public class MaintenanceLog {
    private double cost;
    private Date downTime;
    private int inspectionLog;
    private List<MaintenanceOrder> maintenanceList = new ArrayList<MaintenanceOrder>();
    private List<MaintenanceSchedule> scheduleList = new ArrayList<>();
    private List<MaintenanceRequest> requestList = new ArrayList<>();
    private List<Inspection> inspectionList = new ArrayList<>();
    //private MaintenanceOrder maintenanceOrder;
    //private MaintenanceWorker maintenanceWorker;
    //private MaintenanceRequest maintenanceRequest;
    //private FacilityRoom facilityRoom;
    public int getInspectionLog() {

        inspectionLog = inspectionList.size();

        return inspectionLog;
    }
    public List<Inspection> getInspectionList() {
        return inspectionList;
    }

    public void setInspectionList(List<Inspection> inspectionList){
        this.inspectionList = inspectionList;
    }
    public void addInspection(Inspection inspection){
        inspectionList.add(inspection);
    }
    public void removeInspection(Inspection inspection){
        inspectionList.remove(inspection);
    }

    public void addMaintenanceRequest(MaintenanceRequest maintenanceRequest){
        requestList.add(maintenanceRequest);
    }
    public void cancelMaintenanceRequest(MaintenanceRequest maintenanceRequest){
        requestList.remove(maintenanceRequest);
    }
    public void scheduleMaintenance(MaintenanceSchedule maintenanceSchedule){
        scheduleList.add(maintenanceSchedule);
    }
    public void cancelSchedule(MaintenanceSchedule maintenanceSchedule){
        scheduleList.remove(maintenanceSchedule);
    }
    public void addMaintenanceOrder(MaintenanceOrder maintenanceOrder){
        maintenanceList.add(maintenanceOrder);
    }
    public void cancelMaintenanceOrder(MaintenanceOrder maintenanceOrder){
        maintenanceList.remove(maintenanceOrder);
    }
    public List<MaintenanceOrder> getMaintenanceOrderList(){
        return maintenanceList;
    }

    public void setMaintenanceList(List<MaintenanceOrder> maintenanceList) {
        this.maintenanceList = maintenanceList;
    }
    public List<MaintenanceSchedule> getScheduleList() {
        return scheduleList;
    }

    public List<MaintenanceSchedule> getMaintenanceScheduleList(){
        return scheduleList;
    }

    public void setScheduleList(List<MaintenanceSchedule> scheduleList) {
        this.scheduleList = scheduleList;
    }
    public List<MaintenanceRequest> getRequestList() {
        return requestList;
    }

    public List<MaintenanceRequest> getMaintenanceRequestList(){
        return requestList;
    }

    public void setRequestList(List<MaintenanceRequest> requestList) {
        this.requestList = requestList;
    }
    public double getCost(){
        return cost;
    }
    public Date getDownTime(){
        return downTime;
    }
    public void setCost(int cost){
        this.cost =cost;

    }
    public void setDownTime(Date downTime){
        this.downTime = downTime;
    }
    public double calcMaintenanceCostForFacility(FacilityLocation facilityLocation){
        //TODO enter the method for the calculations
        //TODO check orderdetail order and product as a frame of reference for bookstore
        double totalCost = 0.0;
        for (FacilityRoom room : facilityLocation.getListFacilityRooms().getRoomNumber()) {
            for(MaintenanceOrder order: maintenanceList){
                if(room==order.getFacilityRoom().getRoomNumber())
                    totalCost+=order.getCost();
                //facilityLocation.getListFacilityRooms()==
            }
            total += totalSum.getProduct().getPrice() * totalSum.getQuantity();
        }
        return total;
    }
    public void calcDownTimeForFacility(){
        //TODO enter the method. Decide whether we need Time or Date as the value
    }

}
