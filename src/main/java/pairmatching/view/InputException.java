package pairmatching.view;

import pairmatching.util.Function;

public class InputException {
    public static void nullException(String userInput) {
        if (userInput == null || userInput.isEmpty() || userInput.isBlank()) {
            throw new IllegalArgumentException("아무 값도 입력하지 않았습니다.");
        }
    }
    public static void notFunctionException(String userInput) {
        if (!Function.isFunctionValues(userInput)) {
            throw new IllegalArgumentException("해당 입력은 선택사항에 없습니다.");
        }
    }
}
