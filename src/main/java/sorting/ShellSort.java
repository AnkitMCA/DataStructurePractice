package main.java.sorting;

import java.util.Arrays;

/**
 * The type Shell sort.
 */
public class ShellSort {

    /**
     * Shell sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public int[] shellSort(int arr[]) {

        int arrayLength = arr.length;
        for (int i = arrayLength / 2; i > 0; i = i / 2) {

            for (int j = i; j < arrayLength; j++) {
                int temp = arr[j];
                int k;
                for (k = j; k >= i && arr[k - i] > temp; k = k - i) {
                    arr[k] = arr[k - i];
                }
                arr[k] = temp;
            }
        }
        return arr;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        ShellSort obj = new ShellSort();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        obj.shellSort(arr);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
