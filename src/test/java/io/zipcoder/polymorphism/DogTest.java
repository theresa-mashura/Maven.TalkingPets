package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest extends TestCase {

    @Test
    public void testInheritance() {
        // Given
        Dog dog = new Dog("Buddy");

        // Then
        Assert.assertTrue(dog instanceof Pet);

    }

    @Test
    public void testConstructor() {
        // Given
        Dog dog = new Dog("Buddy");

        // When
        String actual = dog.getName();

        // Then
        Assert.assertEquals("Buddy", actual);

    }

    @Test public void testSpeak() {
        // Given
        Dog dog = new Dog("Buddy");

        // When
        String actual = dog.speak();

        // Then
        Assert.assertEquals("Bark!", actual);

    }

}