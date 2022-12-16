package pairmatching.domain;

import pairmatching.util.CourseStatus;

import java.util.ArrayList;
import java.util.List;

public class Crews {
    private List<Crew> crews;

    public Crews(List<Crew> crews) {
        this.crews =crews;
    }

    public static Crews of(CourseStatus courseStatus, List<String> userList) {
        return new Crews(getCrewList(courseStatus, userList));
    }

    public static List<Crew> getCrewList(CourseStatus courseStatus, List<String> userList) {
        List<Crew> crews = new ArrayList<>();
        for (String user : userList) {
            crews.add(Crew.of(courseStatus, user));
        }
        return crews;
    }

    public List<Crew> getCrews() {
        return crews;
    }
}
