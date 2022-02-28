package test.java;

import com.university.model.facilityManagement.Inspector;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InspectionTest {

    private List<Inspector> inspectorList;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception{
        inspectorList = new ArrayList<>();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        inspectorList = null;
    }

    @org.junit.jupiter.api.Test
    void addInspector() {
        Inspector inspector = new Inspector();
        inspector.setInspectorID(1);
        inspector.setInspectorFirstName("Dan");
        inspector.setInspectorLastName("Tan");
        inspector.setInspectorTitle("Fire Safety Inspector");
        inspectorList.add(inspector);
        assertEquals(true, inspectorList.contains(inspector));
    }

    @org.junit.jupiter.api.Test
    void removeInspector() {
        Inspector inspector = new Inspector();
        inspector.setInspectorID(1);
        inspector.setInspectorFirstName("Dan");
        inspector.setInspectorLastName("Tan");
        inspector.setInspectorTitle("Fire Safety Inspector");
        inspectorList.add(inspector);
        inspectorList.remove(inspector);
        assertTrue(inspectorList.isEmpty());
    }
}