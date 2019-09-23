package main.java.sorting;

import java.util.Arrays;

/**
 * The type Selection sort.
 */
public class SelectionSort {

    /**
     * Selection sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public int[] selectionSort(int arr[]) {
        int i, j, min, temp;
        for (i = 0; i < arr.length; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        SelectionSort obj = new SelectionSort();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        obj.selectionSort(arr);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
