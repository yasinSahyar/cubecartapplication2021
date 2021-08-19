package com.seleniummaster.classtutorial;

public class Student {
    //first name, last name, gender, id, age, address, weight, height, email, major
    private String firstName;
    private String lastName;
    private String gender;
    private int id;
    private int age;
    private String address;
    private double weight;
    private double height;
    private String email;
    private String major;
    //create a default constructor
    public Student() {
    }

    public Student(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Student(String firstName, String lastName, String gender, String address, String email, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.major = major;
    }

    public Student(String firstName, String lastName, String gender, int id, int age, String address, double weight, double height, String email, String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.id = id;
        this.age = age;
        this.address = address;
        this.weight = weight;
        this.height = height;
        this.email = email;
        this.major = major;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", email='" + email + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
