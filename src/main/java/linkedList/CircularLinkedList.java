package main.java.linkedList;

public class CircularLinkedList {

    ListNode head;
    ListNode tail;

    static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

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

    //    TODO handle position value zero, negative or out of index from list.
    public static CircularLinkedList insertAfterPosition(CircularLinkedList list, int data, int position) {
        ListNode node = new ListNode(data);
        if (position == 1) {
            list.head = node;
            list.tail = node;
            node.next = list.head;
        } else {
            ListNode positionNode = list.head;
            for (int i = 1; i < position; i++) {
                positionNode = positionNode.next;
            }
            ListNode nextNode = positionNode.next;
            positionNode.next = node;
            node.next = nextNode;
        }
        return list;
    }

    public static void deleteLastNode(CircularLinkedList list) {
        if (list.head == null) {
            System.out.println("\nThere is no element in the Doubly Linked List");
        } else {
            ListNode currentNode = list.head;
            if (currentNode == list.tail) {
                System.out.println("\nDelete CircularLinkedList Last Node with data : " + currentNode.data);
                list.head = null;
                list.tail = null;
                return;
            } else {
                ListNode lastNode = list.head;
                while (lastNode.next != list.tail){
                    lastNode = lastNode.next;
                }
                list.tail = lastNode;
                lastNode.next = list.head;
            }
        }
    }

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

    public static void main(String[] args) {

        CircularLinkedList circularLinkedList = new CircularLinkedList();

        circularLinkedList = insertAtEnd(circularLinkedList, 1);
        circularLinkedList = insertAtEnd(circularLinkedList, 2);
        circularLinkedList = insertAtEnd(circularLinkedList, 3);
        circularLinkedList = insertAtEnd(circularLinkedList, 4);
        circularLinkedList = insertAtEnd(circularLinkedList, 5);

//        printList(circularLinkedList);
//        listLength(circularLinkedList);
//
//        circularLinkedList = insertAtStart(circularLinkedList, 99);

        printList(circularLinkedList);
        listLength(circularLinkedList);


//        TODO problem in insertAfterPosition Method ++++ Not Working
        circularLinkedList = insertAfterPosition(circularLinkedList, 100, 2);

        printList(circularLinkedList);
        listLength(circularLinkedList);

        deleteLastNode(circularLinkedList);

        printList(circularLinkedList);
        listLength(circularLinkedList);

    }
}
