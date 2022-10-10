package com.company;

public class BodyCalculator {
    double height,mass;

    public BodyCalculator(double height, double mass) {
        this.height = height;
        this.mass = mass;
    }

    public BodyCalculator() {
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double racunajBMI(double height, double mass)
    {
       // double BMI=height/mass;
     //   return BMI;
        double toReturn=0;
        toReturn=mass/((height/100 * height/100));
        return  toReturn;
    }
}
