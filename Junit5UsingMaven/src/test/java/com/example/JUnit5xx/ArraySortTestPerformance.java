package com.example.JUnit5xx;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.Duration;

public class ArraySortTestPerformance {
    @Test
    void arraySortPerformance(){
        ArraySort as=new ArraySort();
        int[] unsorted={3,2,4};
        assertTimeout(Duration.ofMillis(15),()->as.sortingArray(unsorted));
    }
}
