package pairmatching.util;

public enum CourseStatus {
    BACKEND("백엔드", "backend-crew.md"),
    FRONTEND("프론트엔드", "frontend-crew.md");

    private final String status;
    private final String fileName;
    CourseStatus(String status, String fileName) {
        this.status = status;
        this.fileName = fileName;
    }

    public String getStatus() {
        return status;
    }

    public String getFileName() {
        return fileName;
    }
}
