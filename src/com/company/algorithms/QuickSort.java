package com.company.algorithms;

public class QuickSort {

    public static void sort(int[] arrayToSort) {
        if (arrayToSort == null || arrayToSort.length == 0) {
            return;
        }

        int arrayLength = arrayToSort.length;
        quickSort(arrayToSort, 0, arrayLength - 1);
    }

    private static void quickSort(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex >= rightIndex) {
            return;
        }

        int border = partitionArray(array, leftIndex, rightIndex);

        if (border - leftIndex < rightIndex - border) {
            quickSort(array, leftIndex, border - 1);
            quickSort(array, border + 1, rightIndex);
        } else {
            quickSort(array, border + 1, rightIndex);
            quickSort(array, leftIndex, border - 1);
        }
    }

    private static int partitionArray(int[] array, int leftIndex, int rightIndex) {
        int pivotValue = choosePivot(array, leftIndex, rightIndex);
        int border = leftIndex - 1;
        int iterator = leftIndex;

        while (iterator < rightIndex) {
            if (array[iterator] < pivotValue) {
                border++;
                if (border != iterator) {
                    SortUtils.swap(array, border, iterator);
                }
            }
            iterator++;
        }
        border++;
        if (border != rightIndex) {
            SortUtils.swap(array, border, rightIndex);
        }
        return border;
    }

    private static int choosePivot(int[] array, int left, int right) {
        int middleIndex = left + (right - left) / 2;
        int pivotValue = array[middleIndex];
        SortUtils.swap(array, middleIndex, right);
        return pivotValue;
    }
}
