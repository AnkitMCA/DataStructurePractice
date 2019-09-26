package main.java.searching;

import java.util.Arrays;

/**
 * The type Binary searching.
 */
public class BinarySearching {

    /**
     * The Return flag.
     */
    static boolean returnFlag = false;

    /**
     * Binary search boolean.
     *
     * @param arr            the arr
     * @param left           the left
     * @param right          the right
     * @param dataToBeSearch the data to be search
     * @return the boolean
     */
    public boolean binarySearch(int[] arr, int left, int right, int dataToBeSearch) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == dataToBeSearch) {
                System.out.println("Element " + arr[mid] + " is found on index : " + mid);
                returnFlag = true;
            }
            if (arr[mid] > dataToBeSearch) {
                return binarySearch(arr, left, mid - 1, dataToBeSearch);
            } else {
                return binarySearch(arr, mid + 1, right, dataToBeSearch);
            }
        }
        return returnFlag;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        BinarySearching obj = new BinarySearching();
        int arr[] = {2, 8, 11, 16, 19, 20, 22, 32, 39, 63};

        int dataToBeSearch = 16;
        System.out.println("Array : " + Arrays.toString(arr));
        boolean flag = obj.binarySearch(arr, 0, arr.length - 1, dataToBeSearch);
        if (!flag) {
            System.out.println("Array does not contain element " + dataToBeSearch);
        }
    }
}