package pairmatching.domain;

import pairmatching.util.CourseStatus;

public class Crew {
    private CourseStatus course;
    private String name;

    public Crew(CourseStatus course, String name) {
        this.course = course;
        this.name = name;
    }

    public static Crew of(CourseStatus course, String name) {
        return new Crew(course, name);
    }

    public String getCourseName() {
        return course.getStatus();
    }

    public String getName() {
        return name;
    }
}
