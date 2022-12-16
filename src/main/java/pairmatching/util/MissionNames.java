package pairmatching.util;

public enum MissionNames {
    CAR_RACE("자동차경주"),
    LOTTO("로또 "),
    BASEBALL("숫자야구게임"),
    BARCKET("장바구니"),
    PURCHASE("결제"),
    TRAIN("지하철노선도"),
    REFACTOR("성능개선"),
    BUILD("배포");

    private final String name;

    MissionNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
