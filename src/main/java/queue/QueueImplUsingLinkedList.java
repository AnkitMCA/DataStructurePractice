package main.java.queue;

/**
 * The type Queue impl using linked list.
 */
public class QueueImplUsingLinkedList {

    private QueueNode front;
    private QueueNode rear;

    /**
     * Instantiates a new Queue impl using linked list.
     */
    public QueueImplUsingLinkedList() {
        front = null;
        rear = null;
    }

    /**
     * The type Queue node.
     */
    static class QueueNode {

        int data;
        QueueNode next;

        /**
         * Instantiates a new Queue node.
         *
         * @param data the data
         */
        public QueueNode(int data) {
            this.data = data;
        }

        /**
         * Display node.
         */
        public void displayNode() {
            System.out.print(data + " ");
        }
    }


    /**
     * Enqueue.
     *
     * @param data the data
     */
    void enqueue(int data) {
        QueueNode node = new QueueNode(data);
        node.next = null;
        if (isEmpty()) {
            front = node;
            System.out.println(node.data + " inserted into the Queue.");
        } else {
            rear.next = node;
            System.out.println(node.data + " inserted into the Queue.");
        }
        rear = node;
    }

    /**
     * Dequeue int.
     *
     * @return the int
     */
    public int dequeue() {
        int frontData = front.data;
        if (front.next == null) {
            rear = null;
        }
        front = front.next;
        return frontData;
    }

    /**
     * Print front data.
     */
    public void printFrontData() {
        System.out.println("\nFront Data : " + front.data);
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty() {
        return (front == null);
    }

    /**
     * Print queue.
     */
    void printQueue() {
        QueueNode current = front;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        QueueImplUsingLinkedList obj = new QueueImplUsingLinkedList();

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);

        System.out.print("Queue Elements are : ");
        obj.printQueue();

        System.out.println(" \nDequeue Node with data : " + obj.dequeue());
        System.out.println("Dequeue Node with data : " + obj.dequeue());

        System.out.print("Queue Elements are : ");
        obj.printQueue();

        obj.printFrontData();
    }
}