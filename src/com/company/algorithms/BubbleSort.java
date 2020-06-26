package com.company.algorithms;

public class BubbleSort {

    public static void sort(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        int iterator = 0;
        boolean swapped = true;

        while (iterator < arrayLength && swapped) {
            swapped = false;
            for (int i = 0; i < arrayLength - 1 - iterator; i++) {
                if (arrayToSort[i] > arrayToSort[i + 1]) {
                    SortUtils.swap(arrayToSort, i, i + 1);
                    swapped = true;
                }
            }
            iterator++;
        }
    }


}
