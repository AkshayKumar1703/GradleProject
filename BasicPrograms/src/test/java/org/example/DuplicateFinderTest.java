package org.example;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

private final Palindrome palindrome = new Palindrome();

@Test
void testPalindromeList() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1);
    assertTrue(palindrome.isListPalindrome(numbers));
}

@Test
void testNonPalindromeList() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    assertFalse(palindrome.isListPalindrome(numbers));
}

@Test
void testEmptyList() {
    assertFalse(palindrome.isListPalindrome(Collections.emptyList()));
}

@Test
void testNullList() {
    assertFalse(palindrome.isListPalindrome(null));
}

@Test
void testSingleElementList() {
    List<Integer> numbers = Collections.singletonList(9);
    assertTrue(palindrome.isListPalindrome(numbers));
}
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

public class DuplicateFinderTest {
    DuplicatesFinder finder = new DuplicatesFinder();

    @Test
    void testDuplicatesFound() {
        List<Integer> input = Arrays.asList(1,1,2,2,2,3);
        List<Integer>  result = Arrays.asList(1,2);
        assertEquals(result, finder.findduplicates(input));
    }
}
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
