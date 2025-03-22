public class Student implements Comparable<Student>{
    private int studentId;
    private String name;
    private double gpa;

    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
