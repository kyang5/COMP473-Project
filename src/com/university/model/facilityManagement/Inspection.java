package com.university.model.facilityManagement;
import java.util.ArrayList;
import java.util.List;
//TODO consider changing inspectionLog to a List or other type
//TODO check add method.
//TODO check remove method
//TODO check list.
public class Inspection {
    private String inspectionName;
    private int inspectionLog;
    private int inspectionID;
    private List<Inspector> inspectors = new ArrayList<>();

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
        inspectors.add(inspector);

    }
    public void removeInspector(Inspector inspector){
        inspectors.remove(inspector);

    }


}
