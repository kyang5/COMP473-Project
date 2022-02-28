package com.university.model.facilityManagement;
import java.util.*;

public class MaintenanceSchedule {
    //private Date maintenanceDate;
    private Date maintenanceStartDate;
    private Date maintenanceEndDate;
    private MaintenanceWorker maintenanceWorker;


    public Date getMaintenanceStartDate(){
        return maintenanceStartDate;
    }
    public void setMaintenanceStartDate(Date maintenanceStartDate){
        this.maintenanceStartDate = maintenanceStartDate;
    }
    public Date getMaintenanceEndDate(){
        return maintenanceEndDate;
    }
    public void setMaintenanceEndDate(Date maintenanceEndDate){
        this.maintenanceEndDate = maintenanceEndDate;
    }

    public MaintenanceWorker getMaintenanceWorker(){
        return maintenanceWorker;
    }
    public void setMaintenanceWorker(MaintenanceWorker maintenanceWorker){
        this.maintenanceWorker = maintenanceWorker;
    }
    }

