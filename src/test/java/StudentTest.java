import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTest {
    @Test
    public void testStudentValue(){
        Student ali = new Student(1, "ali");
        assertEquals(1, ali.getId());
        assertEquals("ali", ali.getName());
    }
}
