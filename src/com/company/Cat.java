package com.company;

public class Cat extends Enimal{
    private String color;
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;

    }

    public String getColor() {
        return color;
    }
    @Override
    public void print(){
        System.out.println("имя " + getName() +
                "\nвозраст " + getAge() +
                "\nцвет " + getColor() +
                "\n--------------------");

    }
}
