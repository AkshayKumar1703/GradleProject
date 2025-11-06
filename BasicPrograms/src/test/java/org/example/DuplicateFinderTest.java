package org.example;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class DuplicateFinderTest {
    DuplicatesFinder finder = new DuplicatesFinder();

    @Test
    void testDuplicatesFound() {
        List<Integer> input = Arrays.asList(1,2,3,2,1);
        List<Integer>  result = Arrays.asList(1,2);
        assertEquals(result, finder.findduplicates(input));
    }
}
