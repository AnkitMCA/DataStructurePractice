package main.java.queue;

public class QueueImplUsingDynamicCircularArray {

    static final int INCREASE_ARRAY_SIZE_BY = 5;

    private int capacity;
    int queueArray[];
    int front = 0;
    int rear = -1;
    int currentSize = 0;

    public QueueImplUsingDynamicCircularArray(int queueSize) {
        this.capacity = queueSize;
        queueArray = new int[this.capacity];
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("\nOverflow state. Increase capacity.");
            increaseQueueCapacity();
        } else {
            rear++;
            if (rear == capacity - 1) {
                rear = 0;
            }
            queueArray[rear] = item;
            currentSize++;
            System.out.println(item + " is pushed to Queue.");
        }
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("\nQueue is in Underflow state.");
        } else {
            front++;
            if (front == capacity - 1) {
                System.out.println("\nDequeue element: " + queueArray[front - 1]);
                front = 0;
            } else {
                System.out.println("\nDequeue element: " + queueArray[front - 1]);
            }
            currentSize--;
        }
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    private void increaseQueueCapacity() {
        int newCapacity = this.queueArray.length + INCREASE_ARRAY_SIZE_BY;
        int[] newArray = new int[newCapacity];
        int newFront = front, index = -1;
        while (true) {
            newArray[++index] = this.queueArray[newFront];
            newFront++;
            if (newFront == this.queueArray.length) {
                newFront = 0;
            }
            if (currentSize == index + 1) {
                break;
            }
        }
        this.queueArray = newArray;
        System.out.println("\nNew array capacity: " + this.queueArray.length);
        this.front = 0;
        this.rear = index;
    }

    public static void main(String args[]) {
        QueueImplUsingDynamicCircularArray obj = new QueueImplUsingDynamicCircularArray(4);
        System.out.println("Is Queue Empty : " + obj.isQueueEmpty());
        System.out.println("Is Queue Full : " + obj.isQueueFull());

        obj.enqueue(1);
        obj.dequeue();
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.enqueue(6);

        obj.dequeue();

        System.out.println("Is Queue Empty : " + obj.isQueueEmpty());
        System.out.println("Is Queue Full : " + obj.isQueueFull());
    }
}