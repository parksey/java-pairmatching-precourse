package pairmatching.view;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputViewTest {
    @Test
    public void read_test() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("C:\\Users\\parks\\Desktop\\freecourse\\test\\java-pairmatching-precourse\\src\\main\\resources\\backend-crew.md")
            );

            List<String> str = new ArrayList<>();
            String userInput;
            while ((userInput = reader.readLine()) != null) {
                str.add(userInput);
            }

            System.out.println(str.toString());

            reader.close();
        } catch (IOException exception) {
            throw new IllegalArgumentException("잘못 받았습니다.");
        }
    }
}
