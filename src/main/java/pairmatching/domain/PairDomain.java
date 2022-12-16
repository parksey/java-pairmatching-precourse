package pairmatching.domain;

import pairmatching.util.CourseStatus;
import pairmatching.util.Level;
import pairmatching.util.MissionNames;

import java.util.ArrayList;
import java.util.List;

public class PairDomain {
    private Courses courses;
    private Mission mission;

    public PairDomain() {
        mission = new Mission();
    }

    public void initMission() {
        mission.addMission(Level.LEVEL1.getName()
                , List.of(MissionNames.CAR_RACE.getName()
                        , MissionNames.LOTTO.getName()
                        , MissionNames.BASEBALL.getName()));
        mission.addMission(Level.LEVEL2.getName()
                , List.of(MissionNames.BARCKET.getName()
                        , MissionNames.PURCHASE.getName()
                        , MissionNames.TRAIN.getName()));
        mission.addMission(Level.LEVEL3.getName(), List.of());
        mission.addMission(Level.LEVEL3.getName()
                , List.of(MissionNames.REFACTOR.getName()
                        , MissionNames.BUILD.getName()));
        mission.addMission(Level.LEVEL5.getName(), List.of());
    }

    public void initCrews(List<String> backendUsers, List<String> frontendUsers) {
        courses.addCourse(CourseStatus.BACKEND.getStatus(), Crews.of(CourseStatus.BACKEND, backendUsers));
        courses.addCourse(CourseStatus.FRONTEND.getStatus(), Crews.of(CourseStatus.FRONTEND, frontendUsers));
    }

    public Mission getMission() {
        return mission;
    }
}
