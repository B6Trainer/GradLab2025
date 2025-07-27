package com.bala.test.corejava;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest {

    @Test
    public void testAssertions() {
        // Basic assertions
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");
        assertNotEquals(5, 2 + 2, "2 + 2 should not equal 5");
        assertTrue(3 > 2, "3 is greater than 2");
        assertFalse(2 > 3, "2 is not greater than 3");
        assertNull(null, "Object should be null");
        assertNotNull("non-null", "Object should not be null");

        // Array assertions
        int[] expectedArray = {1, 2, 3};
        int[] actualArray = {1, 2, 3};
        assertArrayEquals(expectedArray, actualArray, "Arrays should be equal");

        // Iterable assertions
        ArrayList<Integer> expectedIterable = new ArrayList<>();
        expectedIterable.add(1);
        expectedIterable.add(2);
        expectedIterable.add(3);
        ArrayList<Integer> actualIterable = new ArrayList<>();
        actualIterable.add(1);
        actualIterable.add(2);
        actualIterable.add(3);

        assertIterableEquals(expectedIterable, actualIterable, "Iterables should be equal");

        // Same object assertions
        Object obj = new Object();
        assertSame(obj, obj, "Both references should point to the same object");
        assertNotSame(obj, new Object(), "References should point to different objects");

        // Exception assertions
        assertThrows(IllegalArgumentException.class, () -> {
            throw new IllegalArgumentException("Invalid argument");
        }, "Expected IllegalArgumentException");

        assertDoesNotThrow(() -> {
            // code that does not throw an exception
        }, "No exception should be thrown");

        // Group assertions
        assertAll("Grouped assertions",
                () -> assertEquals(4, 2 + 2),
                () -> assertTrue(3 > 1));

        // Fail utility
        // fail("This test should fail");
    }
}
