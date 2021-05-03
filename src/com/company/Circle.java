package com.company;

public class Circle {
    private double dm;
    private double circleS;
    private double length;
    public int a = 2;

    public Circle(double dm, double circleS, double length, int a) {
        this.dm = dm;
        this.circleS = circleS;
        this.length = length;
        this.a = a;
    }

    public double getDm() {
        return dm;
    }

    public double getCircleS() {
        return circleS;
    }

    public double getLength() {
        return length;
    }

    public int getA() {
        return a;
    }
    public String getInfo(){
        return " " + getA() + " " + getLength() + " " + getDm();
    }
}
