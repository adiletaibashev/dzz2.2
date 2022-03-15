package com.company;

public class Dog extends Enimal{
    private int weight;

    public Dog(String name, int age, int weight) {
        super(name, age);
        this.weight = weight;

    }

    public int getWeight() {
        return weight;
    }
    @Override
    public void print(){
        System.out.println("имя " + getName() +
                "\nвозраст " + getAge() +
                "\nвес " + getWeight() +
                "\n--------------------");

    }
}
