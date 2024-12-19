package model;

import java.util.List;

/**
 * An interface is an abstract class that provides the method signatures of what a class must implement
 */

public interface Evaluation {

    //getApproveCourses is a method that returns a list of Courses

    List<Course> getApprovedCourses();
}

