package students;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    private Students joey;

    @Before
    public void setUp() {
         joey = new Students(0,"Joey");
    }
    @Test public void validId() {
        assertEquals(0,joey.getId());
    }

    @Test
    public void name() {
        assertEquals("Joey",joey.getStudentName());
    }

    @Test
    public void gradeList() {
        joey.addGrade(70);
        joey.addGrade(80);
        joey.addGrade(85);
        assertTrue(joey.listOfGrades.contains(70));
        assertTrue(joey.listOfGrades.contains(80));
        assertTrue(joey.listOfGrades.contains(85));
    }

    @Test
    public void gradeAverage() {
        joey.addGrade(70);
        joey.addGrade(80);
        joey.addGrade(85);
        assertEquals(joey.getGradeAverage(),78.33,1);
    }

}
