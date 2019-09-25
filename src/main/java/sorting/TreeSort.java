package main.java.sorting;

import java.util.Arrays;

/**
 * The type Binary tree implementation.
 */
public class TreeSort {

    static int count = 0;
    static int newArray[] = new int[10];
    static BinaryTreeNode root;

    /**
     * Instantiates a new Tree sort.
     */
    public TreeSort() {
        root = null;
    }

    /**
     * The type Binary tree node.
     */
    static class BinaryTreeNode {

        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;

        /**
         * Instantiates a new Binary tree node.
         *
         * @param data the data
         */
        public BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    /**
     * Add.
     *
     * @param data the data
     */
    public static void add(int data) {
        root = addDataRecursively(root, data);
    }

    /**
     * Add data recursively binary tree node.
     *
     * @param current the current
     * @param data    the data
     * @return the binary tree node
     */
    public static BinaryTreeNode addDataRecursively(BinaryTreeNode current, int data) {

        if (current == null) {
            return new BinaryTreeNode(data);
        }
        if (data < current.data) {
            current.left = addDataRecursively(current.left, data);
        } else if (data > current.data) {
            current.right = addDataRecursively(current.right, data);
        } else {
            System.out.println(current.data + " is already exists in the Binary tree.");
            return current;
        }
        return current;
    }

    /**
     * Traverse in order int [ ].
     *
     * @param node the node
     * @return the int [ ]
     */
    public static int[] traverseInOrder(BinaryTreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            newArray[count] = node.data;
            count++;
            traverseInOrder(node.right);
        }
        return newArray;
    }

    /**
     * Print in order tree int [ ].
     *
     * @param obj the obj
     * @return the int [ ]
     */
    public static int[] printInOrderTree(TreeSort obj) {
        int arr[] = traverseInOrder(obj.root);
        return arr;
    }

    /**
     * Tree sort int [ ].
     *
     * @param arr the arr
     * @return the int [ ]
     */
    public static int[] treeSort(int arr[]) {
        TreeSort obj = new TreeSort();
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
        int arr2[] = printInOrderTree(obj);

        return arr2;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        arr = treeSort(arr);
        System.out.println("Array After Sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
