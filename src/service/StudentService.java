package service;

import model.Course;
import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    private final Map<String, Student> students = new HashMap<>();

    //subscribeStudent
public void subscribeStudent(Student student) {
    students.put(student.getId(), student);
}
    //findStudent
public Student findStudent(String studentId) {
    if(students.containsKey(studentId)) {
        return students.get(studentId);
    }
    return null;
}
    //enrollStudentToCourse
    public void enrollStudentToCourse(String studentId, Course course) {

    //Check that the student exits before enrolling him/her
    if (students.containsKey(studentId)) {
        students.get(studentId).enrolledToCourses(course);
    }
    }

    //Check if the student is subscribed
    public boolean isSubscribed(String studentId) {
    //TODO
        return students.containsKey(studentId);
    }

    //Show summary of all the subscribed students
    public void showSummary() {
    //TODO

    }
}
