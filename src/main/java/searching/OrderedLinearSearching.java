package main.java.searching;

import java.util.Arrays;

/**
 * The type Ordered linear searching.
 */
public class OrderedLinearSearching {

    /**
     * Ordered linear search boolean.
     *
     * @param arr            the arr
     * @param dataToBeSearch the data to be search
     * @return the boolean
     */
    public boolean orderedLinearSearch(int arr[], int dataToBeSearch) {
        int arrayLength = arr.length;
        boolean flag = false;
        for (int i = 0; i < arrayLength; i++) {
            if (arr[i] == dataToBeSearch) {
                System.out.println("Element " + arr[i] + " is found on index : " + i);
                flag = true;
                break;
            }
            // this break the loop control if arr[i] is greater than dataToBeSearch.
            else if (arr[i] > dataToBeSearch) {
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
        OrderedLinearSearching obj = new OrderedLinearSearching();
        int arr[] = {2, 8, 11, 16, 19, 20, 22, 32, 39, 63};

        int dataToBeSearch = 22;
        System.out.println("Array : " + Arrays.toString(arr));
        boolean flag = obj.orderedLinearSearch(arr, dataToBeSearch);
        if (!flag) {
            System.out.println("Array does not contain element " + dataToBeSearch);
        }
    }
}
