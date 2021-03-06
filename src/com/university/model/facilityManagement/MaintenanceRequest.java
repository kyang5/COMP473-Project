package com.university.model.facilityManagement;
import com.university.model.facility.FacilityRoom;

import java.util.*;
//TODO get and set for facilityRoom
public class MaintenanceRequest {
    private String requestType;
    private int requestID;
    private Date requestDate;
    private int requestorID;
    private String requestStatus;
    private String problem;
    private FacilityRoom facilityRoom;


    public int getRequestID(){
        return requestID;
    }
    public Date getRequestDate(){
        return requestDate;
    }
    public String getRequestStatus(){
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
    public void setRequestorID(int requestorID){
        this.requestorID = requestorID;
    }
    public void setRequestStatus(String requestStatus){
        this.requestStatus = requestStatus;
    }
    public FacilityRoom getFacilityRoom(){
        return facilityRoom;
    }
    public void setFacilityRoom(FacilityRoom facilityRoom){
        this.facilityRoom = facilityRoom;
    }


}
