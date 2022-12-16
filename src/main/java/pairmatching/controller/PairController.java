package pairmatching.controller;

import pairmatching.domain.PairDomain;
import pairmatching.util.Function;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairController {
    private final InputView inputView;
    private final OutputView outputView;
    private final PairDomain pairDomain;

    public PairController(InputView inputView, OutputView outputView, PairDomain pairDomain) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.pairDomain = pairDomain;
    }

    public void initPair() {
        pairDomain.initCourses();
    }

    public void start() {
        startProgram();
    }

    /**
     * 기능 선택 시작
     */
    public void startProgram() {
        boolean isQuit = false;
        while (!isQuit) {
            isQuit = doSelect(getUserSelect());
        }
    }

    /**
     * 선택 기능 실행 확인
     * @param select
     * @return
     */
    public boolean isDoSelect(String select) {
        if (Function.QUIT.getSelect().equals(select)) {
            return true;
        }
        activateSelect(select);
        return false;
    }

    /**
     * 선택 기능 실행
     * @param select
     */
    public void activateSelect(String select) {
        if (Function.PAIR.getSelect().equals(select)) {
            matchPair();
        }
        if (Function.SEARCH.getSelect().equals(select)) {
            // 페어 조회
        }
        if(Function.INIT.getSelect().equals(select)) {
            // 초기화
        }
    }

    /**
     * 기능 선택
     * @return
     */
    public String getUserSelect() {
        while (true) {
            try {
                outputView.printFunctionMsg();
                return inputView.readFunctionInput();
            } catch (IllegalArgumentException exception) {
                outputView.printEmptyMsg();
                outputView.printMsg(exception.getMessage());
            }
        }
    }


    public void matchPair() {

    }
}
