package com.company;

public class ObjectA{
    //Enum
    private Figures figures;
    private String name;

    public ObjectA(Figures figures, String name) {
        this.figures = figures;
        this.name = name;
    }

    public Figures getFigures() {
        return figures;
    }

    public String getName() {
        return name;
    }

    public String getInfo(){
        return " " + getFigures() + " " + getName() + " ";
    }
}
