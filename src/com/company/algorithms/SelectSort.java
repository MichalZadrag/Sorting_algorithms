package com.company.algorithms;

public class SelectSort {

    public static void sort(int[] arrayToSort) {
       int arrayLength = arrayToSort.length;
       int minIndex;
       for (int i = 0; i < arrayLength; i++) {
           minIndex = i;
           for (int j = i + 1; j < arrayLength; j++) {
               if (arrayToSort[j] < arrayToSort[minIndex]) {
                   minIndex = j;
               }
           }
           if (minIndex != i) {
               SortUtils.swap(arrayToSort, i, minIndex);
           }
       }
    }
}
