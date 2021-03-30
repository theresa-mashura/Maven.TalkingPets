package io.zipcoder.polymorphism;

import java.util.Comparator;

public class Pet implements Comparable<Pet> {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String speak(){
        return "ROAR!!!";
    };

    public int compareTo(Pet pet) {
        // >0 if greater, <0 is less, 0 if equal
        // >0 if THIS follows ARG in abc order, <0 if THIS precedes the ARG in abc order
        int name = this.name.compareTo(pet.name);

        if (name == 0) {
            return this.getClass().getName().compareTo(pet.getClass().getName());
        }

        return name;
    }

    static class ObjectNameComparator implements Comparator<Pet> {
        public int compare(Pet pet1, Pet pet2) {
            int classType = pet1.getClass().getName().compareTo(pet2.getClass().getName());

            if (classType == 0) {
                return pet1.name.compareTo(pet2.name);
            }

            return classType;
        }
    }
}
