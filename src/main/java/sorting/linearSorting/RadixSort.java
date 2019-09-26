package main.java.sorting.linearSorting;

import java.util.Arrays;

/**
 * The type Radix sort.
 */
public class RadixSort {

    /**
     * Radix sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public int[] radixSort(int arr[]) {
        int maxValue = maxValue(arr);
        for (int i = 1; maxValue / i > 0; i *= 10) {
            arr = sortArray(arr, i);
        }
        return arr;
    }

    private int[] sortArray(int[] arr, int digit) {

        int arrayLength = arr.length;
        int sortedArray[] = new int[arrayLength];

        int count[] = new int[10];
        for (int i = 0; i < count.length; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < arrayLength; i++) {
            count[(arr[i] / digit) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = arrayLength - 1; i >= 0; i--) {
            sortedArray[count[(arr[i] / digit) % 10] - 1] = arr[i];
            count[(arr[i] / digit) % 10]--;
        }
        for (int i = 0; i < arrayLength; i++) {
            arr[i] = sortedArray[i];
        }

        return arr;
    }

    /**
     * Max value int.
     *
     * @param arr the arr
     * @return the int
     */
    static int maxValue(int arr[]) {
        int maxValue = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > maxValue)
                maxValue = arr[i];
        return maxValue;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        RadixSort obj = new RadixSort();
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        obj.radixSort(arr);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
