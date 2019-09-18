package main.java.stack;

/**
 * The type Stack impl using dynamic array.
 */
public class StackImplUsingDynamicArray {

    /**
     * The Increase array size by.
     */
    static final int INCREASE_ARRAY_SIZE_BY = 5;
    /**
     * The Top.
     */
    static int top = -1;
    /**
     * The Length.
     */
    static int length = 0;

    /**
     * Create array int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    static int[] createArray(int[] arr) {
        int newArray[] = new int[length + INCREASE_ARRAY_SIZE_BY];

        // copy prev array data into newArray.
        for (int i = 0; i < length; i++) {
            newArray[i] = arr[i];
        }
        length = length + INCREASE_ARRAY_SIZE_BY;
        return newArray;
    }

    /**
     * Push int [ ].
     *
     * @param arr  the arr
     * @param item the item
     * @return the int [ ]
     */
    static int[] push(int[] arr, int item) {
        if (top == length - 1) {
            arr = createArray(arr);
        }
        arr[++top] = item;
        return arr;
    }

    /**
     * Pop int.
     *
     * @param arr the arr
     * @return the int
     */
    static int pop(int[] arr) {
        if (top < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            int item = arr[top--];
            return item;
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        int arr[] = createArray(new int[length + INCREASE_ARRAY_SIZE_BY]);

        arr = push(arr, 1);
        arr = push(arr, 2);
        arr = push(arr, 3);
        arr = push(arr, 4);
        arr = push(arr, 5);
        arr = push(arr, 6);
        arr = push(arr, 7);
        arr = push(arr, 8);
        arr = push(arr, 9);
        arr = push(arr, 10);
        arr = push(arr, 11);
        arr = push(arr, 12);
        arr = push(arr, 13);
        arr = push(arr, 14);
        arr = push(arr, 15);
        arr = push(arr, 16);
        arr = push(arr, 17);
        arr = push(arr, 18);

        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nPop item with value : " + pop(arr));
        System.out.println("Pop item with value : " + pop(arr));
        System.out.println("Pop item with value : " + pop(arr));
        System.out.println("Pop item with value : " + pop(arr));
        System.out.println("Pop item with value : " + pop(arr));
    }
}