package com.company;

public class Main {

    public static void main(String[] args) {
	 System.out.println("First GIT Project");

     BodyCalculator b= new BodyCalculator(186,80);
     double BMI=b.racunajBMI(b.getHeight(),b.getMass());
     System.out.println(BMI);
    }
}
