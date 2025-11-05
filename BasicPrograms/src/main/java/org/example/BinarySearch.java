package org.example;
import java.util.List;

public class BinarySearch {

    public int binarySearch(List<Integer> numbers, int target) {
        int left = 0;
        int right = numbers.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // calculate middle index

            if (numbers.get(mid) == target) {
                return mid; // found the target
            }

            if (numbers.get(mid) < target) {
                left = mid + 1; // search in the right half
            } else {
                right = mid - 1; // search in the left half
            }
        }

        return -1; // not found
    }
}
