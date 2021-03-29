package io.zipcoder.polymorphism;

public class Parrot extends Pet {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public String speak(){
        return "Tweet!";
    }
}
