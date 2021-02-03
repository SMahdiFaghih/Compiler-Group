import java.io.FileReader;
import java.io.IOException;
import MyScanner.MyScanner;


public class Compiler{
    private static Compiler instance = new Compiler();
    public static Compiler getInstance() {
        return instance;
    }

    public void compile(String inputFileName, String OutputFileName) throws IOException {
        // parsing phase call
        FileReader fileReader = new FileReader(inputFileName);
        MyScanner scanner = new MyScanner(fileReader);

        // codeGen phase call
    }
}