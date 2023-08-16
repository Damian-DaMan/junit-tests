import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;


public class StudentTest {

    private Student emptyStudent;
    private Student actualStudent;
    private ArrayList<Integer> emptyArrayList;
    private ArrayList<Integer> testGrades;

    @Before
    public void setup() {
        assertEquals(actualStudent.getId(), 1L);
        emptyArrayList = new ArrayList<>();
    }


    @Test
    public void testStudentConstructor() {
        assertNull(emptyStudent);
        assertNotNull(actualStudent);
    }

    @Test
    public void testStudentGetters() {
        assertEquals(actualStudent.getId(), 1L);
        assertEquals(actualStudent.getName(), "Steve");

        assertNotNull(actualStudent.getGrades());
        assertEquals(actualStudent.getGrades(), emptyArrayList);
    }

    @Test
    public void testStudentAddGrade() {
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        ArrayList<Integer> expectedGrades = new ArrayList<>(Arrays.asList(50,75,100));

        assertEquals(actualStudent.getGrades(), expectedGrades);
    }

    @Test
    public void testStudentGetGrades(){
        actualStudent.addGrade(50);
        actualStudent.addGrade(75);
        actualStudent.addGrade(100);

        assertEquals(actualStudent.getGradeAverage(), 75, 0.0000001);
    }

}