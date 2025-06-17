package day5;

import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private char gender;
    private String location;
    private static Student student;
    
    private Student() {
        System.out.println("Person object is created");
    }
    
    public static Person createPerson() {
        if (student == null) {
            student = new Student();
        }
        return student;
    }
    
    public void setStudent(int id, String name, char gender, String location) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.location = location;
    }
    
    @Override
    public String toString() {
        return "Student Details = Id:" + id + ", Name:" + name +
         ", Gender:" + gender + ", Location:" + location;
    }
}

public class SingleTone1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = Student.createStudent();
        student1.setStudent(101, "nithin", 'm', "mysuru");
        System.out.println(student1); // System.out.print(person.toString());
        Student student2 = Student.createStudent();
        System.out.println(student1); // System.out.print(person.toString());
        student2.setStudent(102, "aadya", 'f', "mysuru");
        System.out.println(student1); // System.out.print(person.toString());
    }
}
