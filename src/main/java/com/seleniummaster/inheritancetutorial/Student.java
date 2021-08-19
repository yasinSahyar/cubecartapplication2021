package com.seleniummaster.inheritancetutorial;

public class Student {
    private String firstName;
    private String lastName;
    private String className;
    private int age;
    private String major;

    public Student(){

    }

    public Student(String firstName, String lastName, String className, int age, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.className = className;
        this.age = age;
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

  /*  public void setFirstName(String firstName) {
        this.firstName = firstName;
    }*/

    public String getLastName() {
        return lastName;
    }

    public String getClassName() {
        return className;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", major='" + major + '\'' +
                '}';
    }



   /* public void book(){

    }*/

    /*public void add(int i, int j){
        System.out.println("The sum of two numbers is : " + (i+j));
    }
   *//* public int add(int i, int j){
        System.out.println("The sum of two numbers is : " + (i+j));
        return i+j;
    }*//*

     *//*   private String add(int i, int j, String a){
        System.out.println("The sum of two numbers is : " + (i+j));
        return "i+j";
    }*//*
    public void add(int i, int j, int k){
        System.out.println("The sum of three numbers is : " + (i+j+k));
    }
    public void add(double i, double j){
        System.out.println("The sum of two decimal numbers is : " + (i+j));
    }
    public static void main(String[] args) {
        Student student = new Student();

        student.add(5,6);
        student.add(5,6, 9);
        student.add(4.5, 3.2);
    }*/
}
