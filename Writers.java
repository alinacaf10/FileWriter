package Example.FWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Writers {
    public static final String Folder_Path="C:/Users/HP/Desktop";
    public static final String File_Path=Folder_Path+File.separator+"Student.txt";
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
    public static List<String> readFile()throws IOException{
        List<String> dataList = new ArrayList<>();
        FileReader fr=new FileReader(File_Path);
        BufferedReader br=new BufferedReader(fr);
        while (br.ready()){
            String data=br.readLine();
            dataList.add(data);
        }
        return dataList;
    }
}
