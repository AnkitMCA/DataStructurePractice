package main.java.recursion;

/**
 * The type Is array in sorted order.
 */
public class IsArrayInSortedOrder {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
//        int arr[] = {1, 2, 3, 4, 5, 6, 9 , 8};

        IsArrayInSortedOrder obj = new IsArrayInSortedOrder();
        int value = obj.arrayIsSorted(arr, 8);
        if (value == 1) {
            System.out.println("Array is Sorted");
        } else if (value == 0) {
            System.out.println("Array is Not Sorted");
        }
    }

    /**
     * Array is sorted int.
     *
     * @param arr   the arr
     * @param index the index
     * @return the int
     */
    public int arrayIsSorted(int arr[], int index) {

        if (arr.length == 1 || index <= 1) {
            return 1;
        } else {
            return (arr[index - 1] < arr[index - 2]) ? 0 : arrayIsSorted(arr, index - 1);
        }
    }

}
