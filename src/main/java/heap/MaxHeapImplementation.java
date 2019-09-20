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

        obj.printHeap();
    }
}
