package pairmatching.util;

import java.util.ArrayList;
import java.util.List;

public enum CourseStatus {
    BACKEND("백엔드", "backend-crew.md"),
    FRONTEND("프론트엔드", "frontend-crew.md");

    private final String status;
    private final String fileName;
    CourseStatus(String status, String fileName) {
        this.status = status;
        this.fileName = fileName;
    }

    public static List<String> keys() {
        List<String> keys = new ArrayList<>();
        for (CourseStatus courseStatus : CourseStatus.values()) {
            keys.add(courseStatus.status);
        }
        return keys;
    }

    public String getStatus() {
        return status;
    }

    public String getFileName() {
        return fileName;
    }
}
