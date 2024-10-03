import java.util.Formatter;
import java.util.Scanner;

public class File_Write {
    public static void main(String[] args) {
        int num;
        String name,id;
        try {
            Formatter formatter=new Formatter("E:/Java New/File create_read and write/Student.txt");
                 Scanner sc=new Scanner(System.in);
////            System.out.println("Enter the num of student:");
//            num=sc.nextInt();
            for (int i = 0; i <3; i++) {
                System.out.print("Enter id:");
                id=sc.nextLine();
                System.out.print("Student Name:");
                name=sc.nextLine();

                formatter.format("%s %s\n",name,id);
            }



//            formatter.format("%s%s\n","100"," suyab amin sunny");
//            formatter.format("%s%s\n ","101"," sunny");
//            formatter.format("%s%s\n","103"," sa");
            formatter.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
