package Example.FWriter;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Read or Write");
        switch (sc.next()){
            case "write":
                try {        Writers writers=new Writers();
                    Student student=new Student();
                    System.out.println("Add Name");
                    student.setName(sc.next());
                    System.out.println("Add Surname");
                    student.setSurname(sc.next());
                    System.out.println("Add Grnum (Enter only number type)");
                    student.setGrnum(sc.nextInt());
                    System.out.println("Add Lesson");
                    student.setLesson(sc.next());
                    Writers.write(student);
                    System.out.println("when you need stop program you may write 'STOP' if you need continue press any key and send");
                    String stop=sc.next();
                    if (!stop.equals("STOP")) {
                        main(args);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "read":
       List<String> dataList= Writers.readFile();
        for (String data:dataList){
            System.out.println(data);
        }
        break;
            default:
                System.out.println("invalid option");
                break;
        }

    }
}
