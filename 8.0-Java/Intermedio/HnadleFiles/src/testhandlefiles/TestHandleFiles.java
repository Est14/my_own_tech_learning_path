package testhandlefiles;
import static handlefiles.HandleFiles.*;
;
public class TestHandleFiles {
    public static void main(String[] args) {
        var fileName = "/home/estebancode14/Desktop/test.py";
        String content = "print('Hello python from Java')";
        //createFile(fileName);
        //writeFile(fileName,content);
        // appendFile(fileName, "if __name__ == '__main__':\n    print('Append something from Java')");
        readFile(fileName);
    }
}
