package com.university.model.facilityManagement;

import com.university.model.facility.FacilityManager;

public class Inspector {
    //Variables for information about the inspector
    //TODO Consider giving the Strings unique identifier names
    //TODO check with whether or not the variables need to be private
    //TODO check the naming schemas of the parameters
    private String firstName;
    private String lastName;
    private int inspectorID;
    private String title;

    public String getInspectorFirstName() {
        return firstName;

    }

    public String getInspectorLastName() {
        return lastName;

    }

    public int getInspectorID() {
        return inspectorID;

    }

    public String getInspectorTitle() {
        return title;

    }

    public void setInspectorFirstName(String firstName) {
        this.firstName = firstName;


    }

    public void setInspectorLastName(String lastName) {
        this.lastName = lastName;

    }

    public void setInspectorID(int inspectorID) {
        this.inspectorID = inspectorID;

    }

    public void setInspectorTitle(String title) {
        this.title = title;

    }
}
