import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {

    @Test
    void testSortByGpaAscending() {
        // Arrange
        List<Student> students = new ArrayList<>();
        students.add(new Student(105, "Charlie", 3.5));
        students.add(new Student(101, "Alice", 3.9));
        students.add(new Student(103, "Bob", 3.2));
        students.add(new Student(102, "David", 3.9));
        students.add(new Student(104, "Eve", 3.7));

        // Act
        Collections.sort(students);

        // Assert
        assertEquals(3.2, students.get(0).getGpa());
        assertEquals(3.5, students.get(1).getGpa());
        assertEquals(3.7, students.get(2).getGpa());
        assertEquals(3.9, students.get(3).getGpa());
        assertEquals(3.9, students.get(4).getGpa());

        //check if the order is correct
        assertTrue(students.get(0).getGpa() <= students.get(1).getGpa());
        assertTrue(students.get(1).getGpa() <= students.get(2).getGpa());
        assertTrue(students.get(2).getGpa() <= students.get(3).getGpa());
        assertTrue(students.get(3).getGpa() <= students.get(4).getGpa());
    }

    @Test
    void testSortWithSameGpa() {
        // Arrange
        List<Student> students = new ArrayList<>();
        students.add(new Student(105, "Charlie", 3.5));
        students.add(new Student(101, "Alice", 3.9));
        students.add(new Student(103, "Bob", 3.2));
        students.add(new Student(102, "David", 3.9));
        students.add(new Student(104, "Eve", 3.7));
        students.add(new Student(106, "Frank", 3.2));

        // Act
        Collections.sort(students);

        // Assert
        // Check that students with the same GPA are grouped together
        assertEquals(3.2, students.get(0).getGpa());
        assertEquals(3.2, students.get(1).getGpa());
        assertEquals(3.5, students.get(2).getGpa());
        assertEquals(3.7, students.get(3).getGpa());
        assertEquals(3.9, students.get(4).getGpa());
        assertEquals(3.9, students.get(5).getGpa());

        //check if the order is correct
        assertTrue(students.get(0).getGpa() <= students.get(1).getGpa());
        assertTrue(students.get(1).getGpa() <= students.get(2).getGpa());
        assertTrue(students.get(2).getGpa() <= students.get(3).getGpa());
        assertTrue(students.get(3).getGpa() <= students.get(4).getGpa());
        assertTrue(students.get(4).getGpa() <= students.get(5).getGpa());
    }
}