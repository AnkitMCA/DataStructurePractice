package main.java.heap;

/**
 * The type Min heap implementation.
 */
public class MinHeapImplementation {

    private static final int FRONT = 1;
    private static int[] heap;
    private int heapSize;
    private int maxSize;

    /**
     * Instantiates a new Min heap implementation.
     *
     * @param maxSize the max size
     */
    public MinHeapImplementation(int maxSize) {
        this.maxSize = maxSize;
        this.heapSize = 0;
        heap = new int[this.maxSize + 1];
        heap[0] = Integer.MIN_VALUE;
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

        while (heap[current] < heap[parent(current)]) {
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

    private int leftChild(int position) {
        return (2 * position);
    }

    private int rightChild(int position) {
        return (2 * position) + 1;
    }

    private boolean isLeafNode(int position) {
        if (position >= (heapSize / 2) && position <= heapSize) {
            return true;
        }
        return false;
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
     * Min heap.
     */
    public void minHeap() {
        for (int position = (heapSize / 2); position >= 1; position--) {
            minHeapify(position);
        }
    }

    private void minHeapify(int position) {
        if (!isLeafNode(position)) {
            if (heap[position] > heap[leftChild(position)] || heap[position] > heap[rightChild(position)]) {
                if (heap[leftChild(position)] < heap[rightChild(position)]) {
                    swap(position, leftChild(position));
                    minHeapify(leftChild(position));
                } else {
                    swap(position, rightChild(position));
                    minHeapify(rightChild(position));
                }
            }
        }
    }

    /**
     * Remove minimum element int.
     *
     * @return the int
     */
// TODO Last element of the array found duplicate after removing minimum element.
    public int removeMinimumElement() {
        int popItem = heap[FRONT];
        heap[FRONT] = heap[heapSize--];
        minHeapify(FRONT);
        return popItem;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        MinHeapImplementation obj = new MinHeapImplementation(20);
        obj.insert(6);
        obj.insert(12);
        obj.insert(4);
        obj.insert(27);
        obj.insert(15);
        obj.insert(9);
        obj.insert(7);
        obj.insert(22);
        obj.insert(14);
        obj.insert(51);
        obj.insert(8);

        System.out.println("Print heap : ");
        obj.printHeap();
        obj.minHeap();
        System.out.println("Print Min-heap : ");
        obj.printHeap();

        System.out.println("Remove Root node from heap with value : " + obj.removeMinimumElement());

        System.out.println("Print heap : ");
        obj.printHeap();
        obj.minHeap();
        System.out.println("Print Min-heap : ");
        obj.printHeap();
    }
}
