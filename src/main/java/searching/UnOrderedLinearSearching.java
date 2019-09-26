package main.java.searching;

import java.util.Arrays;

/**
 * The type Un ordered linear searching.
 */
public class UnOrderedLinearSearching {

    /**
     * Un ordered linear search boolean.
     *
     * @param arr            the arr
     * @param dataToBeSearch the data to be search
     * @return the boolean
     */
    public boolean unOrderedLinearSearch(int arr[], int dataToBeSearch) {
        int arrayLength = arr.length;
        boolean flag = false;
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] == dataToBeSearch) {
                System.out.println("Element " + arr[i] + " is found on index : " + i);
                flag = true;
                break;
            }
        }
        return flag;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        UnOrderedLinearSearching obj = new UnOrderedLinearSearching();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        int dataToBeSearch = 22;

        System.out.println("Array : " + Arrays.toString(arr));
        boolean flag = obj.unOrderedLinearSearch(arr, dataToBeSearch);
        if (!flag) {
            System.out.println("Array does not contain element " + dataToBeSearch);
        }
    }
}
