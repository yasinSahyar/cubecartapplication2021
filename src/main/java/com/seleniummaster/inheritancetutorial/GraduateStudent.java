package com.seleniummaster.inheritancetutorial;

public class GraduateStudent extends Student {
    private String researchFields;
    private String adviserName;

    public GraduateStudent(String firstName, String lastName, String className, int age, String major, String researchFields, String adviserName) {
        super(firstName, lastName, className, age, major);
        this.researchFields = researchFields;
        this.adviserName = adviserName;
    }



    public String getResearchFields() {
        return researchFields;
    }

    public String getAdviserName() {
        return adviserName;
    }

    @Override
    public String toString() {
        return String.format("FirstName=%s LastName=%s ClassName=%s Age=%s Major=%s ResearchFields=%s AdviserName=%s",
                super.getFirstName(), super.getLastName(), super.getClassName(), super.getAge(), super.getMajor(), researchFields, adviserName );
    }



   /* public void teachingSource(){
        book();
        setFirstName("Semet");
    }*/

    /* public void calc(){

    }
    @Override
    public void add(int i, int j) {
        int sum = i+j;
        System.out.println("The sum of two numbers is : " + sum);
    }*/


}
