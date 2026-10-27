package student.scholarship;

public class Application {
    public static void main(String[] args) {
        ScholarshipStudent s1 = new ScholarshipStudent("Adnan", "20255103068", 80, 50000);

        // Upcasting
        Person p1 = s1;

        // Dynamic Method Dispatch
        p1.displayInfo();

        System.out.println("Scholarship Amount: " + s1.calculateScholarship());
    }
}
