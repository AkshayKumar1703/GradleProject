package org.example;

import java.util.ArrayList;
import java.util.List;

public class JavaProblems {

    // Binary Search
    public int binarySearch(List<Integer> numbers, int target) {
        int left = 0;
        int right = numbers.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers.get(mid) == target)
                return mid;

            if (numbers.get(mid) < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // Linear Search
    public int linearSearch(List<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++)
            if (numbers.get(i) == target)
                return i;
        return -1;
    }

<<<<<<< HEAD
    // Palindrome check
=======
    //  Palindrome check
>>>>>>> a0f87fd (Deleted old classes)
    public boolean isListPalindrome(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty())
            return false;

        int left = 0;
        int right = numbers.size() - 1;

        while (left < right) {
            if (!numbers.get(left).equals(numbers.get(right)))
                return false;
            left++;
            right--;
        }
        return true;
    }

<<<<<<< HEAD
    // Duplicates Finder (neighbor based)
=======
    //  Duplicates Finder (neighbor based)
>>>>>>> a0f87fd (Deleted old classes)
    public List<Integer> findDuplicates(List<Integer> numbers) {
        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1)) &&
                    !duplicates.contains(numbers.get(i))) {
                duplicates.add(numbers.get(i));
            }
        }

        return duplicates;
    }
}
