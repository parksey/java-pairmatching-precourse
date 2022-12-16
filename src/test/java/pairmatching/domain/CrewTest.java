package pairmatching.domain;

import org.junit.jupiter.api.Test;
import pairmatching.util.CourseStatus;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CrewTest {
    @Test
    public void crew_test() {
        Crew crew = Crew.of(CourseStatus.BACKEND, "세연");
        assertThat(crew.getCourseName()).isEqualTo("백엔드");
    }

    @Test
    public void crews_test() {
        List<String> userList = List.of("세연", "밥세공기");
        Crews crews = Crews.of(CourseStatus.BACKEND, userList);
        for (Crew crew : crews.getCrews()) {
            assertThat(userList).contains(crew.getName());
        }

    }
}
