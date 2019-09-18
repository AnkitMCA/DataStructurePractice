
package main.java.linkedList;

/**
 * The type Circular linked list.
 */
public class CircularLinkedList {

    /**
     * The Head.
     * The Tail.
     */
    ListNode head;
    ListNode tail;

    /**
     * The type List node.
     */
    static class ListNode {
        private int data;
        private ListNode next;

        /**
         * Instantiates a new List node.
         *
         * @param data the data
         */
        public ListNode(int data) {
            this.data = data;
        }
    }

    /**
     * Insert at end circular linked list.
     *
     * @param list the list
     * @param data the data
     * @return the circular linked list
     */
    public static CircularLinkedList insertAtEnd(CircularLinkedList list, int data) {
        ListNode node = new ListNode(data);
        if (list.head == null) {
            list.head = node;
            list.tail = node;
            node.next = list.head;
        } else {
            list.tail.next = node;
            list.tail = node;
            list.tail.next = list.head;
        }
        return list;
    }

    /**
     * Insert at start circular linked list.
     *
     * @param list the list
     * @param data the data
     * @return the circular linked list
     */
    public static CircularLinkedList insertAtStart(CircularLinkedList list, int data) {
        ListNode node = new ListNode(data);
        if (list.head == null) {
            list.head = node;
            list.tail = node;
            node.next = list.head;
        } else {
            ListNode currentNode = list.head;
            node.next = currentNode;
            list.head = node;
            list.tail.next = list.head;
        }
        return list;
    }

    /**
     * Insert after position circular linked list.
     *
     * @param list     the list
     * @param data     the data
     * @param position the position
     * @return the circular linked list
     */
//    TODO handle position value zero, negative or out of index from list.
    public static CircularLinkedList insertAfterPosition(CircularLinkedList list, int data, int position) {
        ListNode node = new ListNode(data);
        if (list.head == null) {
            list.head = node;
            list.tail = node;
            node.next = list.head;
        } else {
            if (position == 0) {
                ListNode currentNode = list.head;
                list.head = node;
                node.next = currentNode;
                list.tail.next = node;
            } else if (position > 0) {
                ListNode positionNode = list.head;
                for (int i = 1; i < position; i++) {
                    positionNode = positionNode.next;
                }
                if (positionNode == list.tail) {
                    positionNode.next = node;
                    node.next = list.head;
                    list.tail = node;
                } else {
                    node.next = positionNode.next;
                    positionNode.next = node;
                }
            }
        }
        return list;
    }

    /**
     * Delete last node.
     *
     * @param list the list
     */
    public static void deleteLastNode(CircularLinkedList list) {
        if (list.head == null) {
            System.out.println("\nThere is no element in the Circular Linked List");
        } else {
            ListNode currentNode = list.head;
            if (currentNode == list.tail) {
                System.out.println("\nDelete CircularLinkedList Last Node with data : " + currentNode.data);
                list.head = null;
                list.tail = null;
                return;
            } else {
                ListNode lastNode = list.head;
                while (lastNode.next != list.tail) {
                    lastNode = lastNode.next;
                }
                System.out.println("\nDelete CircularLinkedList Last Node with data : " + lastNode.next.data);
                list.tail = lastNode;
                lastNode.next = list.head;
            }
        }
    }

    /**
     * Delete first node.
     *
     * @param list the list
     */
    public static void deleteFirstNode(CircularLinkedList list) {
        if (list.head == null) {
            System.out.println("\nThere is no element in the Circular Linked List");
        } else {
            ListNode currentNode = list.head;
            if (currentNode == list.tail) {
                System.out.println("\nDelete CircularLinkedList First Node with data : " + currentNode.data);
                list.head = null;
                list.tail = null;
                return;
            } else {
                System.out.println("\nDelete CircularLinkedList First Node with data : " + currentNode.data);
                ListNode nextNode = list.head.next;
                list.head = nextNode;
                list.tail.next = nextNode;
            }
        }
    }

    /**
     * Delete node with position.
     *
     * @param list     the list
     * @param position the position
     */
    public static void deleteNodeWithPosition(CircularLinkedList list, int position) {
        if (list.head == null) {
            System.out.println("\nThere is no element in the Doubly Linked List");
        } else {
            if (position == 1) {
                if (list.head == list.tail) {
                    System.out.println("\nDelete CircularLinkedList Node at position " + position + " with data : " + list.head.data);
                    list.head = null;
                    list.tail = null;
                } else {
                    System.out.println("\nDelete CircularLinkedList Node at position " + position + " with data : " + list.head.data);
                    ListNode nextNode = list.head.next;
                    list.head = nextNode;
                    list.tail.next = nextNode;
                }
            } else {
                ListNode currentNode = list.head;
                ListNode prevNode = list.head;
                for (int i = 1; i < position; i++) {
                    prevNode = currentNode;
                    currentNode = currentNode.next;
                }
                if (currentNode == list.tail) {
                    list.tail = prevNode;
                    prevNode.next = list.head;
                    System.out.println("\nDelete CircularLinkedList Node at position " + position + " with data : " + currentNode.data);
                } else {
                    System.out.println("\nDelete CircularLinkedList Node at position " + position + " with data : " + currentNode.data);
                    prevNode.next = currentNode.next;
                }
            }
        }
    }

    /**
     * List length.
     *
     * @param list the list
     */
    public static void listLength(CircularLinkedList list) {
        ListNode currentNode = list.head;
        int length = 0;
        if (list.head != null) {
            do {
                currentNode = currentNode.next;
                length++;
            } while (currentNode != list.head);
        }
        System.out.println("\nLength of CircularLinkedList : " + length);
    }

    /**
     * Print list.
     *
     * @param list the list
     */
    public static void printList(CircularLinkedList list) {
        ListNode currentNode = list.head;
        System.out.print("\nCircularLinkedList : ");
        if (list.head != null) {
            do {
                System.out.print(currentNode.data + " ");
                currentNode = currentNode.next;
            } while (currentNode != list.head);
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList = insertAtEnd(circularLinkedList, 1);
        circularLinkedList = insertAtEnd(circularLinkedList, 2);
        circularLinkedList = insertAtEnd(circularLinkedList, 3);
        circularLinkedList = insertAtEnd(circularLinkedList, 4);
        circularLinkedList = insertAtEnd(circularLinkedList, 5);

//        printList(circularLinkedList);
//        listLength(circularLinkedList);

        circularLinkedList = insertAtStart(circularLinkedList, 99);

//        printList(circularLinkedList);
//        listLength(circularLinkedList);

        circularLinkedList = insertAfterPosition(circularLinkedList, 100, 1);

        printList(circularLinkedList);
        listLength(circularLinkedList);

        deleteLastNode(circularLinkedList);

        printList(circularLinkedList);
        listLength(circularLinkedList);

        deleteFirstNode(circularLinkedList);

        printList(circularLinkedList);
        listLength(circularLinkedList);

        deleteNodeWithPosition(circularLinkedList, 2);

        printList(circularLinkedList);
        listLength(circularLinkedList);
    }
}
