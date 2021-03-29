package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ConsoleTest {

    @Test
    public void testCreatePetObject(){
        // Given
        Console c = new Console();

        // When
        c.createPetObject("cat", "Kitty");
        ArrayList<Pet> actual = c.getUserPets();
        Cat actualCat = (Cat) actual.get(0);

        // Then
        Assert.assertEquals("Kitty", actualCat.getName());

    }
}
