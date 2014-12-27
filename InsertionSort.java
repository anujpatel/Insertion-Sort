package com.anuj.algorithms;

import java.util.Arrays;

/**
 *
 * @author Anuj
 * @source goldenpackagebyanuj.blogspot.com
 */
public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {12, 9, 4, 99, 120, 1, 3, 10};

        System.out.println("Before Sorting :" + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting : " + Arrays.toString(arr));
    }

    public static void insertionSort(int arr[]) {
        System.out.println("Intermediate Happenings : ");
        for (int i = 1; i < arr.length; i++) {
            int valueToSort = arr[i];

            int j = i;
            while (j > 0 && arr[j - 1] > valueToSort) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = valueToSort;
            System.out.println(Arrays.toString(arr));
        }
    }
}
