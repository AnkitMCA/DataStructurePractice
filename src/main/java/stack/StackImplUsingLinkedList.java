package main.java.stack;

/**
 * The type Stack impl using linked list.
 */
public class StackImplUsingLinkedList {

    /**
     * The Head.
     */
    StackNode head;

    /**
     * The type Stack node.
     */
    static class StackNode {
        /**
         * The Data.
         */
        int data;
        /**
         * The Next.
         */
        StackNode next;

        /**
         * Instantiates a new Stack node.
         *
         * @param data the data
         */
        public StackNode(int data) {
            this.data = data;
        }
    }

    /**
     * Push.
     *
     * @param data the data
     */
    public void push(int data) {

        StackNode node = new StackNode(data);
        if (head == null) {
            head = node;
        } else {
            StackNode temp = head;
            head = node;
            node.next = temp;
        }
        System.out.println(data + " pushed into the stack.");
    }

    /**
     * Pop int.
     *
     * @return the int
     */
    public int pop() {
        int popItem = Integer.MIN_VALUE;
        if (head == null) {
            System.out.println("Stack is empty.");
        } else {
            popItem = head.data;
            head = head.next;
        }
        return popItem;
    }

    /**
     * Peek int.
     *
     * @return the int
     */
    public int peek() {
        if (head == null) {
            System.out.println("Stack is empty.");
            return Integer.MIN_VALUE;
        } else {
            return head.data;
        }
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty() {
        if (head == null) {
            System.out.println("Stack is empty");
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

        StackImplUsingLinkedList obj = new StackImplUsingLinkedList();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);

        System.out.println("Top Item is : " + obj.peek());
        System.out.println("Is stack empty : " + obj.isEmpty());

        System.out.println("Pop Item with data : " + obj.pop());
        System.out.println("Pop Item with data : " + obj.pop());
        System.out.println("Pop Item with data : " + obj.pop());
        System.out.println("Pop Item with data : " + obj.pop());
        System.out.println("Pop Item with data : " + obj.pop());

        System.out.println("Is stack empty : " + obj.isEmpty());
    }
}
