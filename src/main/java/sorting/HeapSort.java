package main.java.sorting;

import java.util.Arrays;

/**
 * The type Heap sort.
 */
public class HeapSort {

    /**
     * Heap sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public int[] heapSort(int arr[]) {
        int arrayLength = arr.length;
        for (int i = (arrayLength / 2) - 1; i >= 0; i--) {
            heapify(arr, arrayLength, i);
        }
        for (int i = arrayLength - 1; i >= 0; i--) {
            int temp;
            temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
        return arr;
    }

    private void heapify(int[] arr, int arrayLength, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < arrayLength && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < arrayLength && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp;
            temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, arrayLength, largest);
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        HeapSort obj = new HeapSort();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        obj.heapSort(arr);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
