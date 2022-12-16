package pairmatching.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Courses {
    private Map<String, Crews> courses;

    public Courses() {
        courses = new HashMap<>();
    }

    public void addCourse(String course, Crews crews) {
        courses.put(course, crews);
    }
}
