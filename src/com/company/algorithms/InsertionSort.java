package com.company.algorithms;

public class InsertionSort {

    public static void sort(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        int currentElement;
        int otherIndex;
        for (int i = 1; i < arrayLength; i++) {
            currentElement = arrayToSort[i];
            otherIndex = i;
            while (otherIndex > 0 && currentElement < arrayToSort[otherIndex - 1]) {
                arrayToSort[otherIndex] = arrayToSort[otherIndex - 1];
                otherIndex--;
            }
            arrayToSort[otherIndex] = currentElement;
        }

    }
}
