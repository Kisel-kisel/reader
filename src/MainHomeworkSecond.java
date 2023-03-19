import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainHomeworkSecond {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int finish = scanner.nextInt();

        String path = "data.txt";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        FileWriter writer = new FileWriter("resize_data.txt");

//        List<String> strings = new ArrayList<>();
        String str = "";
        int count = 0;

        while ( str != null ){
            str = bufferedReader.readLine();
            count++;
            if (count >= start && count <= finish){
//                strings.add(str);
                writer.write(str + '\n');
            }
        }
        System.out.println(writer);

        fileReader.close();
        bufferedReader.close();
        writer.close();







    }
}
