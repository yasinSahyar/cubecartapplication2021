package com.seleniummaster.classtutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentPrint {
    public static void main(String[] args) {
        Student student1=new Student();  //create an instance of Object
        student1.setFirstName("Jason");
        student1.setLastName("Smith");
        student1.setGender("Male");
        student1.setAge(18);
        student1.setHeight(180);
        student1.setWeight(70);
        student1.setId(100001);
        student1.setMajor("Software Test Automation");
        student1.setAddress("xxxx main street, Wahsington DC, DC");
        student1.setEmail("jason.smith@gmail.com");
        Student student2=new Student();
        student2.setFirstName("Maria");
        student2.setLastName("Christopher");
        student2.setGender("Female");
        student2.setId(100002);
        student2.setAge(19);
        student2.setHeight(160);
        student2.setWeight(60);
        student2.setMajor("Art Designing");
        student2.setAddress("1234 Kapal Steet, Istanbul, Turkey");
        student2.setEmail("maria.christopher@gmail.com");
        List<Student> students=new ArrayList<>(); //define a list for students
        students.add(student1);
        students.add(student2);
        int totalStudent=students.size();
        System.out.println("student count: "+totalStudent);
        for(int i=0;i<totalStudent;i++)
        {
            System.out.println(students.get(i).getFirstName());
        }

        for(Student eachstudent: students)
        {
            System.out.println(String.format("Name %s ",eachstudent.getFirstName()+" "+eachstudent.getLastName()));
            System.out.println(String.format("Gender %s  id %d    age %d     height %.1f    weight %.1f",
                    eachstudent.getGender(),eachstudent.getId(), eachstudent.getAge(),eachstudent.getHeight(),eachstudent.getWeight()));
            System.out.println(eachstudent.getAddress());
            System.out.println(eachstudent.getEmail());
            System.out.println();
        }


    }
}
