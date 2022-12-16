package pairmatching.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Courses {
    private List<String> courses;

    public Courses() {
        courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }
}
