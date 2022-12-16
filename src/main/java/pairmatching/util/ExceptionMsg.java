package pairmatching.util;

public enum ExceptionMsg {
    ERROR("[ERROR] "),
    NULL("아무 값도 입력하지 않았습니다."),
    NOT_FUNCTION("해당 입력은 선택사항에 없습니다."),
    NOT_PAIR_FORMAT("페어를 하기위해서는 과정, 레벨, 미션을 입력해야 합니다.");

    private final String msg;

    ExceptionMsg(String msg) {
        this.msg =msg;
    }

    public String getMsg() {
        return ERROR.msg + msg;
    }
}
