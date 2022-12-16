package pairmatching.util;

public enum Function {
    PAIR("1", "1. 페어 매칭"),
    SEARCH("2", "2. 페어 조회"),
    INIT("3", "3. 페어 초기화"),
    QUIT("Q", "Q. 종료");

    private final String select;
    private final String msg;

    Function(String select, String msg) {
        this.select = select;
        this.msg = msg;
    }


    public String getSelect() {
        return select;
    }

    public String getMsg() {
        return msg;
    }
}
