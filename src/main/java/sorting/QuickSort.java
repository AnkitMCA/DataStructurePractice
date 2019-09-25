package main.java.sorting;

import java.util.Arrays;

/**
 * The type Quick sort.
 */
public class QuickSort {

    /**
     * Quick sort int [ ].
     *
     * @param arr  the arr
     * @param low  the low
     * @param high the high
     * @return the int [ ]
     */
    public int[] quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
        return arr;
    }

    private int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp;
        temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        QuickSort obj = new QuickSort();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        obj.quickSort(arr, 0, arr.length - 1);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
