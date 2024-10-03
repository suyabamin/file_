import java.io.File;
import java.util.Scanner;

public class File_Read {
    public static void main(String[] args) {
        try {
            File file=new File("Student.txt");
            Scanner sc=new Scanner(file);

            while (sc.hasNext()){
                String id=sc.next();
                String name=sc.next();
                System.out.println("Id: "+id+" name: "+name);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
