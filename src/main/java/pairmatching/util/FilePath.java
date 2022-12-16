package pairmatching.util;

public enum FilePath {
    FILE_PATH("C:\\Users\\parks\\Desktop\\freecourse\\test\\java-pairmatching-precourse\\src\\main\\resources\\");
    private final String path;

    FilePath(String path) {
        this.path = path;
    }

    public String getPath(String path) {
        return FILE_PATH.path + path;
    }
}
