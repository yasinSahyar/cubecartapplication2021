package com.seleniummaster.inheritancetutorial;

public class StudentInformation {
    public static void main(String[] args) {

        GraduateStudent graduateStudent = new GraduateStudent("Alim", "Kadir", "United Coder", 19
                ,"Test Automation", "Automation", "Dolkun");

        System.out.println(graduateStudent.toString());

    }

}
