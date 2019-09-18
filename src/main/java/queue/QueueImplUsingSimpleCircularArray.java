package main.java.queue;

/**
 * The type Queue impl using simple circular array.
 */
public class QueueImplUsingSimpleCircularArray {

    private static int front, rear, capacity;
    private static int queue[];

    /**
     * Instantiates a new Queue impl using simple circular array.
     *
     * @param capacityValue the capacity value
     */
    public QueueImplUsingSimpleCircularArray(int capacityValue) {
        front = rear = 0;
        capacity = capacityValue;
        queue = new int[capacity];
    }

    /**
     * Enqueue operation.
     *
     * @param data the data
     */
//    insert data in queue;
    public void enqueueOperation(int data) {
        if (capacity == rear) {
            System.out.println("Queue is full.");
            return;
        } else {
            queue[rear] = data;
            rear++;
        }
        return;
    }

    /**
     * Dequeue operation.
     */
    public void dequeueOperation() {
        if (front == rear) {
            System.out.println("Queue is empty.");
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity) {
                queue[rear] = Integer.MIN_VALUE;
            }
            rear--;
        }
        return;
    }

    /**
     * Display queue.
     */
    public void displayQueue() {
        if (front == rear) {
            System.out.println("Queue is empty.");
        }
        for (int i = front; i < rear; i++) {
            System.out.printf("%d <<--", queue[i]);
        }
        return;
    }

    /**
     * Print front element.
     */
    public void printFrontElement() {
        if (front == rear) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("\nFront Element of the Queue : " + queue[front]);
    }

    /**
     * Queue length int.
     *
     * @return the int
     */
    public int queueLength() {
        int length = 0;
        for (int i = front; i < rear; i++) {
            length++;
        }
        return length;
    }

    /**
     * Is queue empty boolean.
     *
     * @return the boolean
     */
    public boolean isQueueEmpty() {
        if (front == rear) {
            return true;
        }
        return false;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        QueueImplUsingSimpleCircularArray obj = new QueueImplUsingSimpleCircularArray(5);
        obj.displayQueue();
        obj.enqueueOperation(1);
        obj.enqueueOperation(2);
        obj.enqueueOperation(3);
        obj.enqueueOperation(4);
        obj.enqueueOperation(5);

        System.out.print("\nQueue : ");
        obj.displayQueue();

        System.out.println("\nLength of Queue : " + obj.queueLength());

        obj.dequeueOperation();
        obj.dequeueOperation();
        obj.dequeueOperation();

        System.out.print("\nUpdated Queue : ");
        obj.displayQueue();

        obj.printFrontElement();

        System.out.println("\nIs Queue empty : " + obj.isQueueEmpty());

    }
}