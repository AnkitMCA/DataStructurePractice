package main.java.sorting;

import java.util.Arrays;

/**
 * The type Merge sort.
 */
public class MergeSort {

    /**
     * Merge sort.
     *
     * @param arr   the arr
     * @param left  the left
     * @param right the right
     * @return the int [ ]
     */
    public int[] mergeSort(int arr[], int left, int right) {

        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            arr = merge(arr, left, mid, right);
        }
        return arr;
    }

    private int[] merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int leftArray[] = new int[n1];
        int rightArray[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }

        return arr;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        MergeSort obj = new MergeSort();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting");
        System.out.println(Arrays.toString(arr));
        obj.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
