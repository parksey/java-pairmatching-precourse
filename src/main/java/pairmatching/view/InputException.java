package pairmatching.view;

import pairmatching.util.ExceptionMsg;
import pairmatching.util.Function;

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
}
