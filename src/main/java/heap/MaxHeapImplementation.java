package main.java.heap;

/**
 * The type Max heap implementation.
 */
public class MaxHeapImplementation {

    private static int[] heap;
    private int heapSize;
    private int maxSize;

    /**
     * Instantiates a new Max heap implementation.
     *
     * @param maxSize the max size
     */
    public MaxHeapImplementation(int maxSize) {
        this.maxSize = maxSize;
        this.heapSize = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MAX_VALUE;
    }


    /**
     * Insert.
     *
     * @param element the element
     */
    public void insert(int element) {
        if (heapSize >= maxSize) {
            return;
        }
        heapSize++;
        heap[heapSize] = element;
        int current = heapSize;

        while (heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void swap(int position1, int position2) {
        int temp;
        temp = heap[position1];
        heap[position1] = heap[position2];
        heap[position2] = temp;
    }

    private int parent(int position) {
        return (position / 2);
    }

    /**
     * Print heap.
     */
    public void printHeap() {
        for (int i = 1; i <= heapSize / 2; i++) {
            System.out.print("Parent : " + heap[i] + "\t");
            System.out.print("Left Child : " + heap[2 * i] + "\t");
            System.out.print("Right Child : " + heap[2 * i + 1] + "\t\n");
        }
    }

    public int removeMaximumElement() {
        int popped = heap[1];
        heap[1] = heap[heapSize--];
        maxHeapify(1);
        return popped;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeafNode(int pos) {
        if (pos >= (heapSize / 2) && pos <= heapSize) {
            return true;
        }
        return false;
    }

    private void maxHeapify(int position) {
        if (isLeafNode(position)) {
            return;
        }
        if (heap[position] < heap[leftChild(position)] || heap[position] < heap[rightChild(position)]) {
            if (heap[leftChild(position)] > heap[rightChild(position)]) {
                swap(position, leftChild(position));
                maxHeapify(leftChild(position));
            } else {
                swap(position, rightChild(position));
                maxHeapify(rightChild(position));
            }
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
//    TODO Problem occurs when even numbers of elements inserted.
    public static void main(String[] args) {

        MaxHeapImplementation obj = new MaxHeapImplementation(20);
        obj.insert(14);
        obj.insert(3);
        obj.insert(8);
        obj.insert(32);
        obj.insert(6);
        obj.insert(18);
        obj.insert(51);
        obj.insert(22);
        obj.insert(24);
        obj.insert(15);
        obj.insert(5);

        System.out.println("\nMax-Heap Elements : ");
        obj.printHeap();
        System.out.println("\nRemove node with maximum value : " + obj.removeMaximumElement());
        System.out.println("\nMax-Heap Elements : ");
        obj.printHeap();
    }
}
