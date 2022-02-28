package com.university.model.facilityManagement;
import com.university.model.facility.FacilityRoom;

import java.util.*;

public class MaintenanceSchedule {
    //private Date maintenanceDate;
    private Date maintenanceStartDate;
    private Date maintenanceEndDate;
    private MaintenanceWorker maintenanceWorker;
    private FacilityRoom facilityRoom;


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

    public FacilityRoom getFacilityRoom() {
        return facilityRoom;
    }

    public void setFacilityRoom(FacilityRoom facilityRoom) {
        this.facilityRoom = facilityRoom;
    }
}

