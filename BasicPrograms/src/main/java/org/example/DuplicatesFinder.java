package org.example;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesFinder {

    public List<Integer> findduplicates(List<Integer> numbers ) {
        List<Integer> duplicates = new ArrayList<>();

        for( int i = 0; i<numbers.size(); i++) {
            for( int j = i+1; j<numbers.size(); j++) {
                if(numbers.get(i).equals(numbers.get(j)) && !duplicates.contains(numbers.get(i))){
                    duplicates.add(numbers.get(i));
                }

            }
        }
        return duplicates;
    }
}
