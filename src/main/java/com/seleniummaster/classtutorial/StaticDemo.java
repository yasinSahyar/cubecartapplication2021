package com.seleniummaster.classtutorial;


class People{


    String studentLastName;
    static String teacher;

    public void show(){
        System.out.println("LastName: " + studentLastName + ";" + " Teacher is: " + teacher);
    }

}


public class StaticDemo {

    public static void main(String[] args) {
        People alim = new People();
        alim.studentLastName = "Tohti";
        alim.teacher = "Dolkun";

        People memet = new People();
        memet.studentLastName = "Niyaz";
        memet.teacher = "Dolkun";

        memet.teacher = "Kaiser";

        alim.show();
        memet.show();
    }




}
