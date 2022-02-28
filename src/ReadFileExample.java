import java.io.*;

public class ReadFileExample  {
    public void readFileText(String filePath) throws IOException {
        File file = new File(filePath);
        BufferedReader br= new BufferedReader(new FileReader(file));
        String line = "";
        int sum=0;
        while ((line= br.readLine()) !=null){
            System.out.println(line);
            sum += Integer.parseInt(line);
        }
        br.close();
        System.out.println("Tổng = " + sum);
    }
}
