package pairmatching.view;

import pairmatching.util.Function;
import pairmatching.util.PrintMsg;

public class OutputView {
    public void printMsg(String msg) {
        System.out.println(msg);
    }

    public void printEmptyMsg() {
        System.out.println();
    }

    public void printFunctionMsg() {
        printMsg(PrintMsg.INPUT_SELECT.getMsg());
        for (Function function : Function.values()) {
            printMsg(function.getMsg());
        }
    }

    public void printMatchInfo() {

    }
}
