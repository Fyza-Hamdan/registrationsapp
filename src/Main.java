import model.Person;
import model.Student;

import java.util.Date;

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student(1, "Student A", "studentA.email.com", new Date("11/22/2000"));
        System.out.println(student1);

        Student student2 = new Student(2, "Student B", "studentB.email.com", new Date("12/12/2000"), 3.5);
        System.out.println(student2);

        // Print out only the average GPA of student2
        System.out.println(student2.getAverage());

        // Change the average GPA of student2
        student2.setAverage(3.2);
        System.out.println(student2.getAverage());
    }
}






