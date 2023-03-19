import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String filePath = "file.txt";
        File file = new File(filePath);

        FileReader fileReader = new FileReader(file);
        System.out.println(fileReader.read());
    }
}