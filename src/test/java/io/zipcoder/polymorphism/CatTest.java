package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CatTest extends TestCase {

    @Test
    public void testInheritance() {
        // Given
        Cat cat = new Cat("Sitchu");

        // Then
        Assert.assertTrue(cat instanceof Pet);

    }

    @Test
    public void testConstructor() {
        // Given
        Cat cat = new Cat("Sitchu");

        // When
        String actual = cat.getName();

        // Then
        Assert.assertEquals("Sitchu", actual);

    }

    @Test public void testSpeak() {
        // Given
        Cat cat = new Cat("Sitchu");

        // When
        String actual = cat.speak();

        // Then
        Assert.assertEquals("Meow!", actual);

    }

}