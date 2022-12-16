package pairmatching.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mission {
    private Map<String, List<String>> mission;

    public Mission() {
        this.mission = new HashMap<>();
    }

    public void addMission(String level, List<String> missionName) {
        mission.put(level, missionName);
    }

    public List<String> getMissionList(String level) {
        return mission.get(level);
    }
}
