package org.example;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

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
}
