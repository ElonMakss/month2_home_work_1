package com.company;

public class ObjectB extends ObjectA{
    //свой сложный тип
    private Circle circle;
    private  double pi = 3.14;
    private String hi = "hello , my friend";

    public ObjectB(Figures figures, String name, Circle circle, double pi, String hi) {
        super(figures, name);
        this.circle = circle;
        this.pi = pi;
        this.hi = hi;
    }

    public Circle getCircle() {
        return circle;
    }

    public double getPi() {
        return pi;
    }

    public String getHi() {
        return hi;
    }

    //перегруженые методы
    public double quadrangleS(double width, double height){
        return width * height;
    }
    final public double quadrangleS(double side){
        return side * side;
    }

    public double circleS(double r){
        return  pi * (r*r);
    }
    public double circleS(double r, double pi){
        return  pi * (r*r);
    }


    @Override
    public String getInfo() {
        return super.getInfo() + " " + getHi() + " " + getPi() + " " + " " + circle.getInfo() + " ";
    }
}
