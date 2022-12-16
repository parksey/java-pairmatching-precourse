package pairmatching.view;

import pairmatching.util.CourseCode;
import pairmatching.util.ExceptionMsg;
import pairmatching.util.Function;
import pairmatching.util.PrintMsg;

import java.util.List;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput == null || userInput.isEmpty() || userInput.isBlank()) {
            throw new IllegalArgumentException(ExceptionMsg.NULL.getMsg());
        }
    }
    public static void notFunctionException(String userInput) {
        if (!Function.isFunctionValues(userInput)) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_FUNCTION.getMsg());
        }
    }

    public static void endWithCommaException(String userInput) {
        if (userInput.endsWith(PrintMsg.COMMA.getMsg())) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_PAIR_FORMAT.getMsg());
        }
    }

    public static void notInputSizeException(List<String> userList) {
        if (userList.size() != CourseCode.COURSE_SIZE.getCode()) {
            throw new IllegalArgumentException(ExceptionMsg.NOT_PAIR_FORMAT.getMsg());
        }
    }
}
