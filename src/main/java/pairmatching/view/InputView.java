package pairmatching.view;

import pairmatching.util.FilePath;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputView {
    private BufferedReader bufferedReader;

    public BufferedReader getFile(String path) throws IOException {
        return new BufferedReader(new FileReader(path));
    }

    /**
     * 백엔드 파일 읽어 오기
     * @return
     */
    public List<String> getBackendList() {
        return readFile(FilePath.BACKEND_PATH.getPath());
    }

    /**
     * 프런트 파일 읽어 오기
     * @return
     */
    public List<String> getFrontendList() {
        return readFile(FilePath.FRONTEND_PATH.getPath());
    }

    public List<String> readFile(String path) {
        try {
            bufferedReader = getFile(path);
            List<String> userList = getUserList();
            bufferedReader.close();
            return userList;
        } catch (IOException exception) {
            throw new IllegalArgumentException("파일 읽어오기 실패하였습니다.");
        }
    }

    public List<String> getUserList() throws IOException{
        List<String> userList = new ArrayList<>();
        String userInput;
        while ((userInput = bufferedReader.readLine()) != null) {
            userList.add(userInput);
        }
        return userList;
    }


}
