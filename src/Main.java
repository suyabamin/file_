import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file1=new File("Student.txt");
        File file2=new File("Teacher.txt");

        try {
            file1.createNewFile();
            file2.createNewFile();
        }catch (Exception e){
            System.out.println(e);
        }
        //file1.delete();
        if(file1.exists()){
            System.out.println("File created Successfullt");
        }else {
            System.out.println("file does Exist");
        }

    }
}