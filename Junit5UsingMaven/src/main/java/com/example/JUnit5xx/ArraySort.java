package com.example.JUnit5xx;

import java.util.Arrays;

public class ArraySort {
    public int[] sortingArray(int[] arr){
        for (int i=0;i<1000000;i++){
            Arrays.sort(arr);
        }
        return arr;
    }
}
