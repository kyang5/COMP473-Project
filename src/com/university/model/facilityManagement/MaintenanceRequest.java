package com.university.model.facilityManagement;
import java.util.*;
//TODO get and set for facilityRoom
public class MaintenanceRequest {
    private String requestType;
    private int requestID;
    private Date requestDate;
    private Time requestTime;
    private int requestorID;
    private Boolean requestStatus;
    private String problem;

    //public void makeFacilityMaintRequest(){

    //}removed because it already had requirements.
    public void scheduleMaintenance(){
        //add to list.

    }
    public int getRequestID(){
        return requestID;
    }
    public Date getRequestDate(){
        return requestDate;
    }
    public Time getRequestTime(){
        return requestTime;
    }
    public Boolean requestStatus(){
        return requestStatus;
    }
    public int getRequestorID(){
        return requestorID;
    }
    public String getRequestType(){
        return requestType;
    }
    public String getProblem(){
        return problem;
    }
    public void setProblem(String problem){
        this.problem = problem;
    }
    public void setRequestType(String requestType){
        this.requestType = requestType;
    }
    public void setRequestID(int requestID){
        this.requestID = requestID;
    }
    public void setRequestDate(Date requestDate){
        this.requestDate = requestDate;
    }
    public void setRequestTime(Time requestTime){
        this.requestTime = requestTime;
    }
    public void setRequestorID(int requestorID){
        this.requestorID = requestorID;
    }
    public void setRequestStatus(Boolean requestStatus){
        this.requestStatus = requestStatus;
    }
    public void listMaintRequest(){
        //TODO create array list?
        //TODO Insert method
    }
    public void addMantenanceRequest(){
        //add to list
    }
    public void cancelMaintenanceRequest(){
        //TODO need to include a remove method
        //just dot remove
    }

}
