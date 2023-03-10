package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;
import pairmatching.util.CourseStatus;
import pairmatching.util.FilePath;
import pairmatching.util.PrintMsg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    private BufferedReader bufferedReader;

    private BufferedReader getFile(String path) throws IOException {
        return new BufferedReader(new FileReader(path));
    }

    private String getUserInput() {
        return Console.readLine();
    }

    /**
     * 백엔드, 프런트 파일 읽어 오기
     * @return
     */
    public List<String> getUserList(String path) {
        return readFile(FilePath.FILE_PATH.getPath(path));
    }


    private List<String> readFile(String path) {
        try {
            bufferedReader = getFile(path);
            List<String> userList = readUserList();
            bufferedReader.close();
            return userList;
        } catch (IOException exception) {
            throw new IllegalArgumentException("파일 읽어오기 실패하였습니다.");
        }
    }

    public List<String> readUserList() throws IOException{
        List<String> userList = new ArrayList<>();
        String userInput;
        while ((userInput = bufferedReader.readLine()) != null) {
            userList.add(userInput);
        }
        return userList;
    }


    public String readFunctionInput() {
        String userInput = getUserInput();
        checkFunctionInput(userInput);
        return userInput;
    }
    public void checkFunctionInput(String userInput) {
        InputException.nullException(userInput);
        InputException.notFunctionException(userInput);
    }

    public List<String> readPairInfo() {
        String userInput = getUserInput();
        return checkGetPairInfo(userInput);
    }

    public List<String> checkGetPairInfo(String userInput) {
        InputException.nullException(userInput);
        InputException.endWithCommaException(userInput);
        List<String> userList = List.of(userInput.split(PrintMsg.COMMA.getMsg()));
        InputException.notInputSizeException(userList);
        return userList;
    }
}
