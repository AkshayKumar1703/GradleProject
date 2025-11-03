package org.example;

import java.util.List;

public class LinearSearch {

    public int linearSearch(List<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == target)
                return i;  // return index if found
        }
        return -1; // return -1 if not found
    }
}
