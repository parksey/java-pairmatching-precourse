package pairmatching.view;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
}
