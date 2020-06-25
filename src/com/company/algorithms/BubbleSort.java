package com.company.algorithms;

public class BubbleSort {

    public static void sort(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        int iterator = 0;
        boolean swapped = true;
        while (iterator < arrayLength - 1 && swapped) {
            swapped = false;
            for (int j = 0; j < arrayLength - 1 - iterator; j++) {
                if (arrayToSort[j] > arrayToSort[j + 1]) {
                    SortUtils.swap(arrayToSort, j, j + 1);
                    swapped = true;
                }
            }
        }
    }


}
