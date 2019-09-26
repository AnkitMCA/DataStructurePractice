package main.java.sorting.linearSorting;

import java.util.Arrays;

/**
 * The type Bucket sort.
 */
public class BucketSort {

    //    BUCKETS size be 1 greater than the MAX element of the array.
    static int BUCKETS = 64;

    /**
     * Bucket sort.
     *
     * @param arr the arr
     */
    public void bucketSort(int arr[]) {
        int arrayLength = arr.length;
        int bucket[] = new int[BUCKETS];

        int i, j, k;
        for (j = 0; j < bucket.length; j++) {
            bucket[j] = 0;
        }

        for (i = 0; i < arrayLength; i++) {
            ++bucket[arr[i]];
        }

        i = 0;
        for (j = 0; j < bucket.length; j++) {
            for (k = bucket[j]; k > 0; --k) {
                arr[i++] = j;
            }
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        BucketSort obj = new BucketSort();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        obj.bucketSort(arr);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
