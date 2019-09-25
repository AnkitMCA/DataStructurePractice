package main.java.sorting;

import java.util.Arrays;

/**
 * The type Binary tree implementation.
 */
public class TreeSort {

    BinaryTreeNode root;

    class BinaryTreeNode {

        int data;
        BinaryTreeNode left;
        BinaryTreeNode right;

        public BinaryTreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public void add(int data) {
        root = addDataRecursively(root, data);
    }

    public BinaryTreeNode addDataRecursively(BinaryTreeNode current, int data) {

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

    public void traverseInOrder(BinaryTreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    public void printInOrderTree(TreeSort obj) {
        traverseInOrder(obj.root);
    }

    public static void main(String[] args) {

        TreeSort obj = new TreeSort();
        int arr[] = {19, 32, 16, 2, 8, 22, 39, 11, 63, 20};

        System.out.println("Array Before Sorting : ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            obj.add(arr[i]);
        }
        System.out.println("Array After Sorting : ");
        obj.printInOrderTree(obj);
    }
}
