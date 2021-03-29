package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class Console {

    private ArrayList<Pet> userPets;

    public Console() {
        this.userPets = new ArrayList<Pet>();
    }

    public ArrayList<Pet> getUserPets() {
        return this.userPets;
    }

    public Integer askHowManyPets() {
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        Integer numberOfPets = getUserInput.nextInt();
        return numberOfPets;
    }

    public String askWhatKindOfPet(Integer num) {
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("Is pet " + num + " a cat, dog, parrot, or other species?");
        String petType = getUserInput.nextLine();
        return petType;
    }

    public String askPetName(Integer num) {
        Scanner getUserInput = new Scanner(System.in);
        System.out.println("What is the name of pet " + num + "?");
        String petName = getUserInput.nextLine();
        return petName;
    }

    public void getInfoFromUser() {
        Integer numPets = this.askHowManyPets();

        int count = 1;
        while (count <= numPets) {
            String petType = this.askWhatKindOfPet(count);
            String petName = this.askPetName(count);
            this.createPetObject(petType, petName);
            count++;
        }
    }

    public void createPetObject(String petType, String petName) {
        if (petType.equalsIgnoreCase("cat")) {
            this.userPets.add(new Cat(petName));
        } else if (petType.equalsIgnoreCase("dog")) {
            this.userPets.add(new Dog(petName));
        } else if (petType.equalsIgnoreCase("parrot")) {
            this.userPets.add(new Parrot(petName));
        } else {
            this.userPets.add(new Pet(petName));
        }
    }

    public void printAnimalsAndSounds() {
        for (Pet p : userPets) {
            System.out.println(p.getName() + " says " + p.speak());
        }
    }
}
