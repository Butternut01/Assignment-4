package com.company;
public class StrategyPattern {
    public static void main(String[] args) {
        int[] array = {5, 1, 4, 2, 8};

        Sorter sorter = new Sorter();

        // Bubble sort
        sorter.setStrategy(new BubbleSortStrategy());
        sorter.sortArray(array.clone());

        // Quick sort
        sorter.setStrategy(new QuickSortStrategy());
        sorter.sortArray(array.clone());
    }
}