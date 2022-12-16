package pairmatching.util;

public enum CourseCode {
    COURSE(0),
    LEVEL(1),
    MISSION(2),
    COURSE_SIZE(3);
    private final int code;

    CourseCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
