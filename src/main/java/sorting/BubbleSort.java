package main.java.sorting;

import java.util.Arrays;

public class BubbleSort {

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
