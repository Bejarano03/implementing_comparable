import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(105, "Charlie", 3.5));
        students.add(new Student(101, "Alice", 3.9));
        students.add(new Student(103, "Bob", 3.2));
        students.add(new Student(102, "David", 3.9));
        students.add(new Student(104, "Eve", 3.7));
        students.add(new Student(106, "Frank", 3.2));

        // Sort the list of students using Collections.sort()
        Collections.sort(students);

        // Print the sorted list of students
        System.out.println("Sorted Students (by GPA in ascending order):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}