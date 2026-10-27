package academy;

public class Student {
    private String studentName;
    private int studentId;
    private double marks;

    public void setStudentName(String name) {
        studentName = name;
    }

    public void setStudentId(int id) {
        studentId = id;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks!");
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getMarks() {
        return marks;
    }
}
