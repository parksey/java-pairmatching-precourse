package pairmatching.domain;

import pairmatching.util.CourseStatus;

public class PairDomain {
    private Courses courses;

    public void initCourses() {
        courses.addCourse(Course.of(CourseStatus.BACKEND.getStatus()));
        courses.addCourse(Course.of(CourseStatus.FRONTEND.getStatus()));
    }
}
