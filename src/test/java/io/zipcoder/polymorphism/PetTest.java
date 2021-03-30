package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class PetTest extends TestCase {

    @Test
    public void testConstructor() {
        // Given
        Pet pet = new Pet("Tweety");

        // When
        String actual = pet.getName();

        // Then
        Assert.assertEquals("Tweety", actual);

    }

    @Test
    public void testSpeak() {
        // Given
        Pet pet = new Pet("Tweety");

        // When
        String actual = pet.speak();

        // Then
        Assert.assertEquals("ROAR!!!", actual);

    }

    @Test
    public void testComparableCompareTo() {
        // Given
        Pet pet = new Pet("Tweety");
        Cat cat = new Cat("Tweety");

        // When
        int actual = pet.compareTo(cat);

        // Then
        Assert.assertTrue(actual > 0);

    }

    @Test
    public void testComparableCompareToDiffNames() {
        // Given
        Pet pet = new Pet("Tweety");
        Pet pet2 = new Pet("Tweetie");

        // When
        int actual = pet.compareTo(pet2);

        // Then
        Assert.assertTrue(actual > 0);

    }

    @Test
    public void testCompare() {
        // Given
        Console c = new Console();
        Parrot parrot = new Parrot("d");
        Cat cat2 = new Cat("c");
        Pet pet = new Pet("a");
        Cat cat = new Cat("a");
        c.getUserPets().add(parrot);
        c.getUserPets().add(cat2);
        c.getUserPets().add(pet);
        c.getUserPets().add(cat);

        // When
        Collections.sort(c.getUserPets());
        Pet actualFirst = c.getUserPets().get(0);
        Pet actualSecond = c.getUserPets().get(1);
        Pet actualThird = c.getUserPets().get(2);
        Pet actualFourth = c.getUserPets().get(3);


        // Then
        Assert.assertEquals(cat, actualFirst);
        Assert.assertEquals(pet, actualSecond);
        Assert.assertEquals(cat2, actualThird);
        Assert.assertEquals(parrot, actualFourth);
    }

    @Test
    public void testComparatorCompare() {
        // Given
        Console c = new Console();
        Parrot parrot = new Parrot("d");
        Cat cat2 = new Cat("c");
        Pet pet = new Pet("a");
        Cat cat = new Cat("b");
        c.getUserPets().add(parrot);
        c.getUserPets().add(cat2);
        c.getUserPets().add(pet);
        c.getUserPets().add(cat);

        // When
        Collections.sort(c.getUserPets(), new Pet.ObjectNameComparator() );
        Pet actualFirst = c.getUserPets().get(0);
        Pet actualSecond = c.getUserPets().get(1);
        Pet actualThird = c.getUserPets().get(2);
        Pet actualFourth = c.getUserPets().get(3);


        // Then
        Assert.assertEquals(cat, actualFirst);
        Assert.assertEquals(cat2, actualSecond);
        Assert.assertEquals(parrot, actualThird);
        Assert.assertEquals(pet, actualFourth);
    }
}