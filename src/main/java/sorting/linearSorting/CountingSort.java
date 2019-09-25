package main.java.sorting.linearSorting;

import java.util.Arrays;
import java.util.Random;

/**
 * The type Counting sort.
 */
public class CountingSort {

    /**
     * The Array length.
     */
    static int arrayLength = 9;

    /**
     * Counting sort.
     *
     * @param arr         the arr
     * @param auxArray    the aux array
     * @param sortedArray the sorted array
     */
    public void countingSort(int arr[], int auxArray[], int sortedArray[]) {
        int K = 0;
        for (int i = 0; i < arrayLength; i++) {
            K = max(K, arr[i]);
        }
        for (int i = 0; i <= K; i++) {
            auxArray[i] = 0;
        }
        for (int i = 0; i < arrayLength; i++) {
            auxArray[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i <= K; i++) {
            int temp = auxArray[i];
            while (temp > 0) {
                sortedArray[j] = i;
                j++;
                temp--;
            }
        }
    }

    private int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        CountingSort obj = new CountingSort();
        int arr[] = new int[arrayLength];
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = random.nextInt(10);
        }

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        int auxArray[] = new int[arrayLength + 1];
        int sortedArray[] = new int[arrayLength];
        obj.countingSort(arr, auxArray, sortedArray);

        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(sortedArray));
    }
}
