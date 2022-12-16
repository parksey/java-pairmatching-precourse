package pairmatching.controller;

import pairmatching.domain.PairDomain;
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

    }

}
