package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ParrotTest extends TestCase {

    @Test
    public void testInheritance() {
        // Given
        Parrot parrot = new Parrot("Tweety");

        // Then
        Assert.assertTrue(parrot instanceof Pet);

    }

    @Test
    public void testConstructor() {
        // Given
        Parrot parrot = new Parrot("Tweety");

        // When
        String actual = parrot.getName();

        // Then
        Assert.assertEquals("Tweety", actual);

    }

    @Test public void testSpeak() {
        // Given
        Parrot parrot = new Parrot("Tweety");

        // When
        String actual = parrot.speak();

        // Then
        Assert.assertEquals("Tweet!", actual);

    }

}