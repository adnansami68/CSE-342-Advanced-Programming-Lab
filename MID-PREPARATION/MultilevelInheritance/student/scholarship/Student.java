package student.scholarship;

public class Student extends Person {
    private String studentId;
    private double marks;

    public Student() {}

    public Student(String name, String studentId, double marks) {
        super(name);
        this.studentId = studentId;
        this.marks = marks;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Marks: " + marks);
    }
}
