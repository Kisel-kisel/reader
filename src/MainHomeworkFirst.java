import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainHomeworkFirst {
    public static void main(String[] args) throws IOException {
        String filepath = "fund.txt";
        File file = new File(filepath);

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        List<PensionFund> germanBanks = new ArrayList<>();
        Random random = new Random();
        String line = "";

        while (line != null){
            line = bufferedReader.readLine();
            PensionFund pensionFund = new PensionFund(null,null,null);
            pensionFund.setFreeMoney(line);
            pensionFund.setItGoverment(random.nextBoolean());
            if (line != null){
                germanBanks.add(pensionFund);
            }
        }
        System.out.println(germanBanks);
        List<PensionFund> second = germanBanks.stream()
                .filter(pensionFund -> pensionFund.getItGoverment() == true)
                .filter(pensionFund -> pensionFund.getFreeMoney().length() < 15)
                .toList();
        System.out.println(second);

        fileReader.close();
        bufferedReader.close();

    }






}
