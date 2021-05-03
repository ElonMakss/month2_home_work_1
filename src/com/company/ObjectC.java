package com.company;

import java.lang.reflect.Field;

final public class ObjectC extends ObjectB{
    private int S;

    public ObjectC(Figures figures, String name, Circle circle, double pi, String hi, int s) {
        super(figures, name, circle, pi, hi);
        S = s;
    }

    public int getS() {
        return S;
    }

    //изменил перегруженные методы
    public double quadrangleS(double width, double height){
        return width * height * 2;
    }
    public double circleS(double r, double pi){
        return  (pi * (r*r)) * 2;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " " + getS();
    }

    public void copy(ObjectC objects){
        this.S = objects.getS();
    }
}
