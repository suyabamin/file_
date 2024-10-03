import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class write {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream finput = new FileInputStream("Student.txt");
            FileOutputStream foutput = new FileOutputStream("Teacher.txt");
            int c=finput.read();
            while (c!=-1){
                foutput.write(c);
                c=finput.read();
            }
            finput.close();
            foutput.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
