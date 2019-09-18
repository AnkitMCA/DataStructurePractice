package main.java.stack;

/**
 * The type Stack impl using simple array.
 */
public class StackImplUsingSimpleArray {

    /**
     * The Max.
     */
    static final int MAX = 10;
    /**
     * The Top.
     */
    int top;
    /**
     * The Arr.
     */
    int arr[] = new int[MAX];

    /**
     * Instantiates a new Stack impl using simple array.
     */
    public StackImplUsingSimpleArray() {
        top = -1;
    }

    /**
     * Push boolean.
     *
     * @param item the item
     * @return the boolean
     */
    boolean push(int item) {
        if (top >= MAX - 1) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            arr[++top] = item;
            System.out.println(item + " pushed into the stack.");
            return true;
        }
    }

    /**
     * Pop int.
     *
     * @return the int
     */
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            int item = arr[top--];
            return item;
        }
    }

    /**
     * Peek int.
     *
     * @return the int
     */
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            int item = arr[top];
            return item;
        }
    }

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    boolean isEmpty() {
        if (top < 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Is full boolean.
     *
     * @return the boolean
     */
    boolean isFull() {
        if (top >= MAX - 1) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        StackImplUsingSimpleArray obj = new StackImplUsingSimpleArray();
        System.out.println("Is Stack Empty : " + obj.isEmpty());
        System.out.println("Is Stack Full : " + obj.isFull());
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.push(8);
        obj.push(9);
        obj.push(10);

        System.out.println("Top Item in Stack : " + obj.peek());

        System.out.println("Is Stack Empty : " + obj.isEmpty());
        System.out.println("Is Stack Full : " + obj.isFull());

        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());
        System.out.println("Pop Item with value : " + obj.pop());

    }
}
