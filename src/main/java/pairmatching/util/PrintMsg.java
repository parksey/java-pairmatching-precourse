package pairmatching.util;

public enum PrintMsg {
    LINE("#############################################"),
    DASH("  - "),
    COLONE(": "),
    BAR(" | "),
    COURSE("과정: "),
    MISSION("미션:"),
    INPUT_SELECT("기능을 선택하세요."),
    INPUT_MATCH("과정, 레벨, 미션을 선택하세요.");
    private final String msg;

    PrintMsg(String msg) {
        this.msg =msg;
    }

    public String getMsg() {
        return msg;
    }
}
