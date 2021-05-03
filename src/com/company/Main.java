package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle circle = new Circle(21, 234, 234, 23);
        ObjectA objectA = new ObjectA(Figures.RECT, "lol");
        ObjectB objectB = new ObjectB(Figures.CIRCLE, "loli", circle, 3.14, "hello");
        ObjectC objectC = new ObjectC(Figures.CUB, "m", circle, 3.14, "hi", 324);
        ObjectC objectC1 = new ObjectC(Figures.CIRCLE, "t", circle, 3.14, "hi", 321);


        System.out.println(objectA.getInfo());
        System.out.println(objectB.getInfo());
        System.out.println(objectC.getInfo());
        System.out.println(objectC1.getInfo());
        objectC1.copy(objectC);
        System.out.println(objectC1.getInfo());





    }
}
