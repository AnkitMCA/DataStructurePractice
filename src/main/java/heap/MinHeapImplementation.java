package main.java.heap;

public class MinHeapImplementation {

    private static final int FRONT = 1;
    private static int[] Heap;
    private int size;
    private int maxsize;

    public MinHeapImplementation(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize + 1];
        Heap[0] = Integer.MIN_VALUE;
    }

    public void insert(int element) {
        if (size >= maxsize) {
            return;
        }
        size++;
        Heap[size] = element;
        int current = size;

        while (Heap[current] < Heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void swap(int position1, int position2) {
        int temp;
        temp = Heap[position1];
        Heap[position1] = Heap[position2];
        Heap[position2] = temp;
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
        if (position >= (size / 2) && position <= size) {
            return true;
        }
        return false;
    }

    public void printHeap() {
        for (int i = 1; i <= size / 2; i++) {
            System.out.print("Parent : " + Heap[i] + "\t");
            System.out.print("Left Child : " + Heap[2 * i] + "\t");
            System.out.print("Right Child : " + Heap[2 * i + 1] + "\t\n");
        }
    }

    public void minHeap() {
        for (int position = (size / 2); position >= 1; position--) {
            minHeapify(position);
        }
    }

    private void minHeapify(int position) {
        if (!isLeafNode(position)) {
            if (Heap[position] > Heap[leftChild(position)] || Heap[position] > Heap[rightChild(position)]) {
                if (Heap[leftChild(position)] < Heap[rightChild(position)]) {
                    swap(position, leftChild(position));
                    minHeapify(leftChild(position));
                } else {
                    swap(position, rightChild(position));
                    minHeapify(rightChild(position));
                }
            }
        }
    }

    // TODO Last element of the array found duplicate after removing minimum element.
    public int removeMinimumElement() {
        int popItem = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);
        return popItem;
    }

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

        System.out.println("Print Heap : ");
        obj.printHeap();
        obj.minHeap();
        System.out.println("Print Min-Heap : ");
        obj.printHeap();

        System.out.println("Remove Root node from Heap with value : " + obj.removeMinimumElement());

        System.out.println("Print Heap : ");
        obj.printHeap();
        obj.minHeap();
        System.out.println("Print Min-Heap : ");
        obj.printHeap();
    }
}
