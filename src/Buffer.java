import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Buffer {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("Student.txt"));
        String data="";
        while ((data=br.readLine())!=null){
            System.out.println(data);
        }
    }
}
