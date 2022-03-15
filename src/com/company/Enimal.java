package com.company;

public abstract class Enimal implements Printable {
    private String name;
    private int age;

    public Enimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }



}
