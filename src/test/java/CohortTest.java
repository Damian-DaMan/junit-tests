import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CohortTest {
    private Cohort emptyCohort;
    private Cohort actualCohort;

    @Before
    public void setup() {
        actualCohort = new Cohort();
    }

    @Test
    public void testCohortConstructors() {
        assertNull(emptyCohort);
        assertNotNull(actualCohort);
    }

    @Test
    public void testCohortAddStudent() {
        Student actualStudent = new Student(1L, "Steve");
        actualCohort.addStudent(actualStudent);
        assertEquals(Arrays.asList(actualStudent), actualCohort.getStudents());
    }

    @Test
    public void testCohortGetCohortAverage() {
        Student actualStudent = new Student(1L, "Steve");
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        actualCohort.addStudent(actualStudent);
        assertEquals(75, actualCohort.getCohortAverage(), 0.000001);
    }
}
