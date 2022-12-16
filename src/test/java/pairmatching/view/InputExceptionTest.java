package pairmatching.view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pairmatching.util.PrintMsg;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputExceptionTest {
    @ParameterizedTest
    @ValueSource(strings = {"", " "})
    public void null_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.nullException(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"0", "q", "21"})
    public void notFunction_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.notFunctionException(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"123, 백엔드, 레벨1, 자동차경주"
                            , ", 백엔드, 레벨1, 자동차경주"
                            , " , 백엔드, 레벨1, 자동차경주"})
    public void notSize(String userInput) {
        List<String> userList = List.of(userInput.split(PrintMsg.COMMA.getMsg()));
        assertThatThrownBy(()-> {
            InputException.notInputSizeException(userList);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @ValueSource(strings = {"백엔드, 레벨1, 자동차경주, "})
    public void notInputSize_test(String userInput) {
        assertThatThrownBy(()-> {
            InputException.endWithCommaException(userInput);
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
