package org.example;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class JavaProblemsTest {

    private final JavaProblems problems = new JavaProblems();

    // ✅ Palindrome Tests
    @Test
    void testPalindromeList() {
        assertTrue(problems.isListPalindrome(Arrays.asList(1,2,3,2,1)));
    }

    @Test
    void testNonPalindromeList() {
        assertFalse(problems.isListPalindrome(Arrays.asList(1,2,3,4,5)));
    }

    @Test
    void testEmptyList() {
        assertFalse(problems.isListPalindrome(Collections.emptyList()));
    }

    @Test
    void testNullList() {
        assertFalse(problems.isListPalindrome(null));
    }

    @Test
    void testSingleElementList() {
        assertTrue(problems.isListPalindrome(Collections.singletonList(9)));
    }


    // ✅ Linear Search Tests
    @Test
    void testElementFound() {
        assertEquals(4, problems.linearSearch(Arrays.asList(2,4,0,1,9), 9));
    }

    @Test
    void testElementNotFound() {
        assertEquals(-1, problems.linearSearch(Arrays.asList(2,4,0,1,9), 5));
    }

    @Test
    void testLinearEmptyList() {
        assertEquals(-1, problems.linearSearch(Collections.emptyList(), 10));
    }


    // ✅ Duplicate Tests
    @Test
    void testDuplicatesFound() {
        assertEquals(Arrays.asList(1,2),
                problems.findDuplicates(Arrays.asList(1,1,2,2,2,3)));
    }

    @Test
    void testNoDuplicates() {
        assertEquals(Collections.emptyList(),
                problems.findDuplicates(Arrays.asList(1,2,3)));
    }


    // ✅ Binary Search Tests
    @Test
    void testBinarySearchMiddle() {
        assertEquals(3, problems.binarySearch(Arrays.asList(1,3,5,7,9,11), 7));
    }

    @Test
    void testBinarySearchStart() {
        assertEquals(0, problems.binarySearch(Arrays.asList(2,4,6,8,10), 2));
    }

    @Test
    void testBinarySearchEnd() {
        assertEquals(4, problems.binarySearch(Arrays.asList(2,4,6,8,10), 10));
    }

    @Test
    void testBinarySearchNotFound() {
        assertEquals(-1, problems.binarySearch(Arrays.asList(1,3,5,7,9), 8));
    }

    @Test
    void testBinarySearchEmptyList() {
        assertEquals(-1, problems.binarySearch(Collections.emptyList(), 5));
    }
}
