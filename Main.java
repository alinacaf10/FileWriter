package Example.FWriter;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Writers writers=new Writers();
        try {
            Scanner sc=new Scanner(System.in);
            Student student=new Student();
            System.out.println("Add Name");
            student.setName(sc.next());
                System.out.println("Add Surname");
            student.setSurname(sc.next());
            System.out.println("Add Grnum (Enter only number type)");
            student.setGrnum(sc.nextInt());
            System.out.println("Add Lesson");
            student.setLesson(sc.next());
                writers.write(student);
            System.out.println("when you need stop program you may write 'STOP' if you need continue press any key and send");
            String stop=sc.next();
            if (!stop.equals("STOP")) {
                main(args);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
