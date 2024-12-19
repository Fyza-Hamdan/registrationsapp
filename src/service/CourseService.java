package service;

import model.Course;
import model.Student;
import model.Module;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseService {

    // stores courses in the app
    private final Map<String, Course> courses = new HashMap<>();

    //Stores list of students
    private final Map<String, List<Student>> enrolledStudents = new HashMap<>();

    public CourseService() {
        Module module = new Module( "INTRO-CS", "Introduction to Computer Science",
                "Introductory module for the generation technical programs" );
        registerCourse( new Course( "INTRO-CS-1", "Introduction to Computer Science", 9, module ) );
        registerCourse( new Course( "INTRO-CS-2", "Introduction to Algorithms", 9, module ) );
        registerCourse( new Course( "INTRO-CS-3", "Algorithm Design and Problem Solving - Introduction ", 9, module ) );
        registerCourse( new Course( "INTRO-CS-4", "Algorithm Design and Problem Solving - Advanced", 9, module ) );
        registerCourse( new Course( "INTRO-CS-5", "Terminal Fundamentals", 9, module ) );
        registerCourse( new Course( "INTRO-CS-6", "Source Control Using Git and Github", 9, module ) );
        registerCourse( new Course( "INTRO-CS-7", "Agile Software Development with SCRUM", 9, module ) );

        Module moduleWebFundamentals = new Module( "INTRO-WEB", "Web Development Fundamentals",
                "Introduction to fundamentals of web development" );
        registerCourse( new Course( "INTRO-WEB-1", "Introduction to Web Applications", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-2", "Introduction to HTML", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-3", "Introduction to CSS", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-4", "Advanced HTML", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-5", "Advanced CSS", 9, moduleWebFundamentals ) );
        registerCourse( new Course( "INTRO-WEB-6", "Introduction to Bootstrap Framework", 9, moduleWebFundamentals ) );
        registerCourse(
                new Course( "INTRO-WEB-7", "Introduction to JavaScript for Web Development", 9, moduleWebFundamentals ) );

    }

    //Store a course into courses by key: course.code, value: course
    public void registerCourse(Course course) {
        courses.put(course.getCode(), course);
    }

    //Getting a course
    public Course getCourse(String code) {
        if(courses.containsKey(code))
            return courses.get(code);  //'get' method belongs to HashMap
        return null;
    }

    //Enroll a student to a course
public void enrollStudent(String courseId, Student student) {
        //if courseId is not found in enrolledStudent
    if (!courses.containsKey(courseId)) {

        //put (add) the courseId to enrollStudents, ad instantiate a new ArrayList
        enrolledStudents.put(courseId, new ArrayList<>());
}
    //thereafter, we add the student to the ArrayList, after getting the courseId
    enrolledStudents.get(courseId).add(student);
}

//Show all enrolled students
    public void showEnrolledStudents(String courseId) {
        if (enrolledStudents.containsKey(courseId)) {
            List<Student> students = enrolledStudents.get(courseId);
            students.forEach(student -> {
                System.out.println(student);
            });
        }
//Show summary of courses and enrolled students
        public void showSummary() {
            System.out.println("Available Courses:");
            for (String key : courses.keySet()) {
                Course course = courses.get(key);
                System.out.println(course);
            }

            System.out.println("Enrolled Students");

            //iterate through the courses' key
            for (String key : enrolledStudents.keySet()) {

                //get each course by its key and store it to local variable course
                List<Student> students = enrolledStudents.get(key);

                //iterate through the returned students by its courseId
                for (Student student : students) {

                    //print out the student
                    System.out.println(student);
                }
            }
        }
    }
    }
