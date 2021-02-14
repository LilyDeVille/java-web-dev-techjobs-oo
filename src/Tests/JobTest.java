package Tests;

//import jdk.internal.event.SecurityPropertyModificationEvent;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Locale;

import static org.junit.Assert.*;


public class JobTest {

    //private static final SecurityPropertyModificationEvent ID = ;

    @Test
    public void testSettingJobId() {
        Job job = new Job();
        Job job2 = new Job();

        boolean result = job.getId() == job2.getId();

        assertFalse(result);

    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

       boolean result = job.getName() == "Product tester";
       boolean result2 = job.getEmployer().getValue() == "ACME";
       boolean result3 = job.getLocation().getValue() == "Desert";
       boolean result4 = job.getPositionType().getValue() == "Quality control";
       boolean result5 = job.getCoreCompetency().getValue() == "Persistence";

       assertTrue(result);
       assertTrue(result2);
       assertTrue(result3);
       assertTrue(result4);
       assertTrue(result5);
    }

    @Test
    public void testJobsForEquality() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        boolean result = job.equals(job2);

        assertFalse(result);


    }

    @Test
    public void testToString() {

        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String result = job.toString();

        assertTrue(result.startsWith("\n"));
        assertTrue(result.endsWith("\n"));

    }

    @Test
    public void labelTestToString() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String result = job.toString();

        assertTrue(result.toLowerCase().equals("\nID: 1\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n".toLowerCase()));
    }

    @Test
    public void emptyFieldToTestToString() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String result = job.toString();

        assertTrue(result.toLowerCase().equals("\nID: 1\nName: Product tester\nEmployer: ACME\nLocation: Data not available\nPosition Type: Quality control\nCore Competency: Persistence\n".toLowerCase()));

    }

    }
