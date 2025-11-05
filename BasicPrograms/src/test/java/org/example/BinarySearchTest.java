package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    private final BinarySearch binarySearch = new BinarySearch();

    @Test
    void testElementFoundMiddle() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9, 11);
        int result = binarySearch.binarySearch(numbers, 7);
        assertEquals(3, result); // 7 is at index 3
    }

    @Test
    void testElementFoundAtStart() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        int result = binarySearch.binarySearch(numbers, 2);
        assertEquals(0, result); // 2 is at index 0
    }

    @Test
    void testElementFoundAtEnd() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
        int result = binarySearch.binarySearch(numbers, 10);
        assertEquals(4, result); // 10 is at index 4
    }

    @Test
    void testElementNotFound() {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        int result = binarySearch.binarySearch(numbers, 8);
        assertEquals(-1, result); // 8 is not in the list
    }

    @Test
    void testEmptyList() {
        List<Integer> numbers = Arrays.asList();
        int result = binarySearch.binarySearch(numbers, 5);
        assertEquals(-1, result); // no elements, so -1
    }
}
