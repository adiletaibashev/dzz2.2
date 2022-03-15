package com.company;

public class Main {

    public static void main(String[] args) {
        Enimal enimals [] = {createObject(Name.CAT),createObject(Name.DOG),createObject(Name.PET)};
        for (int i = 0; i < enimals.length; i++) {
            enimals[i].print();
        }

    }
    public static Enimal createObject(Name className){
        switch (className){
            case CAT:
                Cat cat = new Cat("murzic",8,"black");
                return cat;
            case DOG:
                Dog dog = new Dog("barsik",3,19);
                return dog;
            case PET:
                Pet pet = new Pet("vasia",2,"sfincs");
                return pet;
        }
        return null;

    }
}
