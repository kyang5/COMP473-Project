package com.university.model.facilityManagement;
import com.university.model.facility.FacilityLocation;
import com.university.model.facility.FacilityManager;

import java.util.ArrayList;
import java.util.List;

//TODO consider changing inspectionLog to a List or other type
//TODO check list.
public class Inspection {
    private String inspectionName;
    private int inspectionLog;
    private int inspectionID;
    private Inspector inspector;
    private List<Inspector> inspectorList = new ArrayList<>();
    private List<Inspection> inspectionList = new ArrayList<>();

    public String getInspectionName(){
        return inspectionName;
    }
    public int getInspectionLog(){
        return inspectionLog;
    }
    public int getInspectionID(){
        return inspectionID;
    }
    public void setInspectionName(String inspectionName){
        this.inspectionName = inspectionName;
    }
    public void setInspectionLog(int inspectionLog){
        this.inspectionLog = inspectionLog;
    }
    public void setInspectionID(int inspectionID){
        this.inspectionID = inspectionID;
    }

    public void addInspector(Inspector inspector){
        inspectorList.add(inspector);
    }
    public void removeInspector(Inspector inspector){
        inspectorList.remove(inspector);
    }
    public void addInspection(Inspection inspection){
        inspectionList.add(inspection);
    }
    public void removeInspection(Inspection inspection){
        inspectionList.remove(inspection);
    }
    public Inspector getInspector() {
        return inspector;
    }

    public void setInspector(Inspector inspector) {
        this.inspector = inspector;
    }
    public List<Inspection> getInspectionList() {
        return inspectionList;
    }

    public void setInspectionList(List<Inspection> inspectionList){
        this.inspectionList = inspectionList;
    }
    public List<Inspector> getInspectionList(List<Inspector> inspectorList){
        return inspectorList;
    }



}


