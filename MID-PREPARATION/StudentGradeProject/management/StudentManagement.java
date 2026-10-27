package management;
import academy.Student;
import result.Grade;

public class StudentManagement {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStudentName("Rahim");
        s1.setStudentId(101);
        s1.setMarks(85);

        Student s2 = new Student();
        s2.setStudentName("Karim");
        s2.setStudentId(102);
        s2.setMarks(72);

        Student s3 = new Student();
        s3.setStudentName("Hasan");
        s3.setStudentId(103);
        s3.setMarks(55);

        Grade g = new Grade();

        System.out.println("Student Results");
        System.out.println("-------------------");
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("ID: " + s1.getStudentId());
        System.out.println("Marks: " + s1.getMarks());
        System.out.println("Grade: " + g.calculateGrade(s1));
        System.out.println("-------------------");
        
        System.out.println("Name: " + s2.getStudentName());
        System.out.println("ID: " + s2.getStudentId());
        System.out.println("Marks: " + s2.getMarks());
        System.out.println("Grade: " + g.calculateGrade(s2));
        System.out.println("-------------------");
        
        System.out.println("Name: " + s3.getStudentName());
        System.out.println("ID: " + s3.getStudentId());
        System.out.println("Marks: " + s3.getMarks());
        System.out.println("Grade: " + g.calculateGrade(s3));
    }
}
