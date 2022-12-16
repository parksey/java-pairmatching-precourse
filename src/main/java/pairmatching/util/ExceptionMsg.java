package pairmatching.util;

public enum ExceptionMsg {
    ERROR("[ERROR] "),
    NULL("아무 값도 입력하지 않았습니다."),
    NOT_FUNCTION("해당 입력은 선택사항에 없습니다.");

    private final String msg;

    ExceptionMsg(String msg) {
        this.msg =msg;
    }

    public String getMsg() {
        return ERROR.msg + msg;
    }
}
