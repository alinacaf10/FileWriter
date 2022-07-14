package Example.FWriter;

import java.util.Scanner;

public class Student {
    private String name;
    private String surname;
    private int grnum;
    private String lesson;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGrnum() {
        return grnum;
    }

    public void setGrnum(int grnum) {
        this.grnum = grnum;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
public void addInfos(){
    Scanner sc=new Scanner(System.in);
    System.out.print("Studente ad daxil edin: ");
    setName(sc.next());
    System.out.print("Studente soyad daxil edin: ");
    setSurname(sc.next());
    System.out.print("Studente grup nomresi daxil edin: ");
    setGrnum(sc.nextInt());
    System.out.print("Studente ders daxil edin: ");
    setLesson(sc.next());
}
    public void info(){
        System.out.println("Name: "+getName());
        System.out.println("Surname: "+getSurname());
        System.out.println("Group name: "+getGrnum());
        System.out.println("Lesson: "+getLesson());
}}