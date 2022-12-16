package pairmatching.util;

public enum PrintMsg {
    INPUT_SELECT("기능을 선택하세요.");
    private final String msg;

    PrintMsg(String msg) {
        this.msg =msg;
    }

    public String getMsg() {
        return msg;
    }
}
