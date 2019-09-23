package main.java.sorting;

import java.util.Arrays;

/**
 * The type Bubble sort.
 */
public class BubbleSort {

    /**
     * Bubble sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public int[] bubbleSort(int arr[]) {

        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    /**
     * Bubble sort improved int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    /*public int[] bubbleSortImproved(int arr[]) {
        int pass, i, temp;
        boolean swapped = true;
        for (pass = arr.length - 1; pass >= 0 && swapped; pass--) {
            swapped = false;
            for (i = 0; i < pass - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return arr;
    }*/

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        BubbleSort obj = new BubbleSort();

        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};
        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        arr = obj.bubbleSort(arr);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
