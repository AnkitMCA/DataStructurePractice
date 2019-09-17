package main.java.linkedList;

public class DoublyLinkedList {

    ListNode head;

    static class ListNode {
        private int data;
        private ListNode prev;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

        public ListNode(int data, ListNode prev, ListNode next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    public static DoublyLinkedList insertAtStart(DoublyLinkedList list, int data) {
        ListNode node = new ListNode(data);
        node.prev = null;
        if (list.head == null) {
            list.head = node;
            node.next = null;
        } else {
            ListNode currentNode = list.head;
            list.head = node;
            node.next = currentNode;
        }
        return list;
    }

    public static DoublyLinkedList insertAfterPosition(DoublyLinkedList list, int data, int position) {
        ListNode node = new ListNode(data);
        if (position == 0) {
            node.prev = null;
            if (list.head == null) {
                list.head = node;
                node.next = null;
            } else {
                ListNode currentNode = list.head;
                list.head = node;
                node.next = currentNode;
                currentNode.prev = node;
            }
        } else {
            ListNode positionNode = list.head;
            for (int i = 1; i < position; i++) {
                positionNode = positionNode.next;
            }
            ListNode nextNode = positionNode.next;
            positionNode.next = node;
            node.prev = positionNode;
            node.next = nextNode;
        }
        return list;
    }

    public static DoublyLinkedList insertAtEnd(DoublyLinkedList list, int data) {
        ListNode node = new ListNode(data);
        node.next = null;
        if (list.head == null) {
            node.prev = null;
            list.head = node;
        } else {
            ListNode last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
            node.prev = last;
        }
        return list;
    }


    public static void printList(DoublyLinkedList doublyLinkedList) {
        DoublyLinkedList.ListNode currNode = doublyLinkedList.head;

        System.out.print("\nDoublyLinkedList : ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public static void listLength(DoublyLinkedList list) {
        ListNode currentNode = list.head;
        int length = 0;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        System.out.println("\nLength of DoublyLinkedList : " + length);
    }

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList = insertAtEnd(doublyLinkedList, 1);
        doublyLinkedList = insertAtEnd(doublyLinkedList, 2);
        doublyLinkedList = insertAtEnd(doublyLinkedList, 3);
        doublyLinkedList = insertAtEnd(doublyLinkedList, 4);

        printList(doublyLinkedList);
        listLength(doublyLinkedList);

        doublyLinkedList = insertAtStart(doublyLinkedList, 78);

        printList(doublyLinkedList);
        listLength(doublyLinkedList);

        doublyLinkedList = insertAfterPosition(doublyLinkedList, 88, 3);

        printList(doublyLinkedList);
        listLength(doublyLinkedList);

    }
}
