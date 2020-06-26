package com.company;

import com.company.algorithms.BubbleSort;
import com.company.algorithms.InsertionSort;
import com.company.algorithms.MergeSort;
import com.company.algorithms.SelectSort;

import java.util.Random;

public class Main {

    private static void printArray(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }

    private static void fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort = new int[50];

        Main.fillArray(arrayToSort);
        System.out.println("ARRAY BEFORE SORT");
        Main.printArray(arrayToSort);

        System.out.println("BUBBLE SORT");
        BubbleSort.sort(arrayToSort);
        Main.printArray(arrayToSort);

        System.out.println("SELECT SORT");
        SelectSort.sort(arrayToSort);
        Main.printArray(arrayToSort);

        System.out.println("INSERTION SORT");
        InsertionSort.sort(arrayToSort);
        Main.printArray(arrayToSort);

        System.out.println("MERGE SORT");
        MergeSort.sort(arrayToSort);
        Main.printArray(arrayToSort);
    }
}
