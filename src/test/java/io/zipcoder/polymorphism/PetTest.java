package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

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

    @Test public void testSpeak() {
        // Given
        Pet pet = new Pet("Tweety");

        // When
        String actual = pet.speak();

        // Then
        Assert.assertEquals("ROAR!!!", actual);

    }
}