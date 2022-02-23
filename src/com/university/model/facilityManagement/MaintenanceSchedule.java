package com.university.model.facilityManagement;
import java.util.*;
//TODO create list for the schedule
//TODO add maintenance worker to list.
public class MaintenanceSchedule {
    private Date maintenanceDate;
    private Time maintenanceTime;
    public Date getMaintenanceDate(){
        return maintenanceDate;
    }
    public Time getMaintenanceTime(){
        return maintenanceTime;
    }
    public void setMaintenanceDate(Date maintenanceDate){
        this.maintenanceDate = maintenanceDate;

    }
    public void setMaintenanceTime(Time maintenanceTime){
        this.maintenanceTime = maintenanceTime;


    }
}
