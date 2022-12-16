package pairmatching.util;

public enum FilePath {
    FILE_PATH("C:\\Users\\parks\\Desktop\\freecourse\\test\\java-pairmatching-precourse\\src\\main\\resources\\"),
    BACKEND_PATH("backend-crew.md"),
    FRONTEND_PATH("frontend-crew.md");
    private final String path;

    FilePath(String path) {
        this.path = path;
    }

    public String getPath() {
        return FILE_PATH.path + path;
    }
}
