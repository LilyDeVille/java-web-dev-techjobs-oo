package Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

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

    }
