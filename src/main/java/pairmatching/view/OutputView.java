package pairmatching.view;

import pairmatching.domain.Mission;
import pairmatching.util.*;

import java.util.List;
import java.util.StringJoiner;

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

    public void printMatchInfo(Mission mission) {
        printMsg(PrintMsg.LINE.getMsg());
        printMsg(PrintMsg.COURSE.getMsg() + getStringFormat(CourseStatus.keys()));
        printMsg(PrintMsg.MISSION.getMsg());
        for (Level level : Level.values()) {
            printMsg(PrintMsg.DASH.getMsg()
                    + level.getName()
                    + PrintMsg.COLONE.getMsg()
                    + getStringFormat(mission.getMissionList(level.getName())));
        }
        printMsg(PrintMsg.LINE.getMsg());
    }

    public String getStringFormat(List<String> inputList) {
        StringJoiner stringJoiner = new StringJoiner(PrintMsg.BAR.getMsg());
        for (String input : inputList) {
            stringJoiner.add(input);
        }
        return stringJoiner.toString();
    }

}
