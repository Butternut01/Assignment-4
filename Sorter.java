package com.company;

import java.util.Arrays;

class Sorter {
    private SortingStrategy strategy;

    public void setStrategy(SortingStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortArray(int[] array) {
        strategy.sort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
}