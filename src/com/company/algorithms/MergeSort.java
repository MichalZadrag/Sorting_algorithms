package com.company.algorithms;

public class MergeSort {

    public static int[] extraArray;

    public static void sort(int[] arrayToSort) {
        extraArray = new int[arrayToSort.length];
        mergeSort(arrayToSort, 0, arrayToSort.length - 1);
    }

    private static void mergeSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(array, leftIndex, middleIndex);
            mergeSort(array, middleIndex + 1, rightIndex);
            merge(array, leftIndex, middleIndex, rightIndex);
        }
    }
    private static void merge(int[] array, int lefIndex, int middleIndex, int rightIndex) {
        for (int i = lefIndex; i <= rightIndex; i++) {
            extraArray[i] = array[i];
        }
        int firstIndexOf1stArray = lefIndex;
        int firstIndexOf2ndArray = middleIndex + 1;
        int currentIndex = lefIndex;

        while (firstIndexOf1stArray <= middleIndex && firstIndexOf2ndArray <= rightIndex) {
            if (extraArray[firstIndexOf1stArray] <= extraArray[firstIndexOf2ndArray]) {
                array[currentIndex] = extraArray[firstIndexOf1stArray];
                firstIndexOf1stArray++;
            } else {
                array[currentIndex] = extraArray[firstIndexOf2ndArray];
                firstIndexOf2ndArray++;
            }
            currentIndex++;
        }
        while (firstIndexOf1stArray <= middleIndex) {
            array[currentIndex] = extraArray[firstIndexOf1stArray];
            currentIndex++;
            firstIndexOf1stArray++;
        }
    }
}
