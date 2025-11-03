package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {

    private final LinearSearch linearSearch = new LinearSearch();

    @Test
    void testElementFound() {
        List<Integer> numbers = Arrays.asList(2, 4, 0, 1, 9);
        int result = linearSearch.linearSearch(numbers, 9);
        assertEquals(4, result);
    }

    @Test
    void testElementNotFound() {
        List<Integer> numbers = Arrays.asList(2, 4, 0, 1, 9);
        int result = linearSearch.linearSearch(numbers, 5);
        assertEquals(-1, result);
    }

    @Test
    void testEmptyList() {
        List<Integer> numbers = Arrays.asList();
        int result = linearSearch.linearSearch(numbers, 10);
        assertEquals(-1, result);
    }
}
