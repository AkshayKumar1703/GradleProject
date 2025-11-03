package org.example;

import java.util.List;

public class Palindrome {

    public boolean isListPalindrome(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return false;
        }

        int firstIndex = 0;
        int lastIndex = numbers.size() - 1;

        while (firstIndex < lastIndex) {
            if (!numbers.get(firstIndex).equals(numbers.get(lastIndex))) {
                return false;
            }
            firstIndex++;
            lastIndex--;
        }

        return true;
    }
}
