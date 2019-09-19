package main.java.tree;

/**
 * The type Binary tree implementation.
 */
public class BinaryTreeImplementation {

    /**
     * The Root.
     */
    BinaryTreeNode root;

    /**
     * The type Binary tree node.
     */
    class BinaryTreeNode {

        /**
         * The Data.
         */
        int data;
        /**
         * The Left.
         */
        BinaryTreeNode left;
        /**
         * The Right.
         */
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
    public void add(int data) {
        root = addDataRecursively(root, data);
    }

    /**
     * Add data recursively binary tree node.
     *
     * @param current the current
     * @param data    the data
     * @return the binary tree node
     */
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

    /**
     * Search element boolean.
     *
     * @param element the element
     * @return the boolean
     */
    public boolean searchElement(int element) {
        return isElementExistsInBinaryTree(root, element);
    }

    /**
     * Is element exists in binary tree boolean.
     *
     * @param current the current
     * @param element the element
     * @return the boolean
     */
    public boolean isElementExistsInBinaryTree(BinaryTreeNode current, int element) {
        if (current == null) {
            return false;
        }
        if (element == current.data) {
            return true;
        }
        return element < current.data
                ? isElementExistsInBinaryTree(current.left, element)
                : isElementExistsInBinaryTree(current.right, element);
    }

    /**
     * Traverse in order.
     *
     * @param node the node
     */
    public void traverseInOrder(BinaryTreeNode node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }

    /**
     * Traverse pre order.
     *
     * @param node the node
     */
    public void traversePreOrder(BinaryTreeNode node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    /**
     * Traverse post order.
     *
     * @param node the node
     */
    public void traversePostOrder(BinaryTreeNode node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    /**
     * Print in order tree.
     *
     * @param obj the obj
     */
    public void printInOrderTree(BinaryTreeImplementation obj) {
        traverseInOrder(obj.root);
    }

    /**
     * Print tree in pre order.
     *
     * @param obj the obj
     */
    public void printTreeInPreOrder(BinaryTreeImplementation obj) {
        traversePreOrder(obj.root);
    }

    /**
     * Print tree in post order.
     *
     * @param obj the obj
     */
    public void printTreeInPostOrder(BinaryTreeImplementation obj) {
        traversePostOrder(obj.root);
    }

    /**
     * Delete element.
     *
     * @param element the element
     */
    public void deleteElement(int element) {
        root = deleteElementRecursively(root, element);
    }

    /**
     * Delete element recursively binary tree node.
     *
     * @param current the current
     * @param element the element
     * @return the binary tree node
     */
    public BinaryTreeNode deleteElementRecursively(BinaryTreeNode current, int element) {
        if (current == null) {
            return null;
        }
        if (element == current.data) {
            if (current.left == null && current.right == null) {
                return null;
            }
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }
            int smallestValue = findSmallestValue(current.right);
            current.data = smallestValue;
            current.right = deleteElementRecursively(current.right, smallestValue);
            return current;
        }
        if (element < current.data) {
            current.left = deleteElementRecursively(current.left, element);
            return current;
        }
        current.right = deleteElementRecursively(current.right, element);
        return current;
    }

    private int findSmallestValue(BinaryTreeNode root) {
        return root.left == null ? root.data : findSmallestValue(root.left);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        BinaryTreeImplementation obj = new BinaryTreeImplementation();
        obj.add(6);
        obj.add(4);
        obj.add(8);
        obj.add(3);
        obj.add(5);
        obj.add(7);
        obj.add(9);

        System.out.print("\nBinary Tree Elements are : ");
        obj.printInOrderTree(obj);

        System.out.print("\nBinary Tree Elements in Pre-Order : ");
        obj.printTreeInPreOrder(obj);
        System.out.print("\nBinary Tree Elements in Post-Order : ");
        obj.printTreeInPostOrder(obj);

        System.out.println("\nIs element exists in binary tree : " + obj.searchElement(7));

        obj.deleteElement(6);

        System.out.print("\nBinary Tree Elements are : ");
        obj.printInOrderTree(obj);

        obj.deleteElement(3);

        System.out.print("\nBinary Tree Elements are : ");
        obj.printInOrderTree(obj);
    }
}
