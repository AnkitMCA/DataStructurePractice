package main.java.sorting;

import java.util.Arrays;

/**
 * The type Insertion sort.
 */
public class InsertionSort {

    /**
     * Insertion sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public int[] insertionSort(int arr[]) {

        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        return arr;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        InsertionSort obj = new InsertionSort();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        obj.insertionSort(arr);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
