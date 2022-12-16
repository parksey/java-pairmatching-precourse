package pairmatching.domain;

public class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public static Course of(String courseName) {
        return new Course(courseName);
    }
}
