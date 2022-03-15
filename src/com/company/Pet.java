package com.company;

public class Pet extends Enimal{

    private String breed;

    public Pet(String name, int age,String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    @Override
    public void print(){
        System.out.println("имя " + getName() +
                "\nвозраст " + getAge() +
                "\nпорода " + getBreed() +
                "\n--------------------");
    }
}
