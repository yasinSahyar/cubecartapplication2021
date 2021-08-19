package com.seleniummaster.classtutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentPrintDemo2 {
    public static void main(String[] args) {
        Student student1=new Student("Mike","Smith","Male");
        Student student2=new Student("Maria","Chris","Female","xxx main street, Tokyo Japan",
                "maria.chris@hotmail.com",
                "Software Engineering");
        Student student3=new Student("Lucas","Smith","Male",100003,20,
                "xxx street",70,170,"lucas.smith@gmail.com","Boxing");

        Student student4=new Student("Lucas","Smith","Male",0,0,
                "",0,0,"","");
        List<Student> students=new ArrayList<>();
        students.add(student1); students.add(student2); students.add(student3); students.add(student4);

        for(Student eachstudent: students)
        {
            System.out.println(eachstudent.toString());
        }
    }
}
