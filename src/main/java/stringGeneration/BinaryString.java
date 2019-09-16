package main.java.stringGeneration;

import java.util.Arrays;

/**
 * The type Binary string.
 */
public class BinaryString {

    /**
     * The N.
     */
    static int num = 4;
    /**
     * The Arr.
     */
    static int arr[] = new int[num];

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        BinaryString obj = new BinaryString();
        obj.generateBinaryString(num);
    }

    /**
     * Generate binary string.
     *
     * @param num the num
     */
    public void generateBinaryString(int num) {
        if (num < 1) {
            System.out.println(Arrays.toString(arr));
        } else {
            arr[num - 1] = 0;
            generateBinaryString(num - 1);
            arr[num - 1] = 1;
            generateBinaryString(num - 1);
        }
    }
}
