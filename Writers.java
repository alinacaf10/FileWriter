package Example.FWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writers {
    public static final String Folder_Path="C:/Users/HP/Desktop";
    public static final String File_Path=Folder_Path+File.separator+"Writerss.txt";
    public static void write(Student student) throws IOException{
        File f=new File(Folder_Path) ;
        if (!f.exists()){
            f.mkdir();
        }
      try( FileWriter fw=new FileWriter(File_Path,true);
        BufferedWriter bw=new BufferedWriter(fw);){
          bw.write(student.getName()+"..."+student.getSurname()+"..."+student.getGrnum()+"..."+student.getLesson());
        bw.newLine();
    }}
}
