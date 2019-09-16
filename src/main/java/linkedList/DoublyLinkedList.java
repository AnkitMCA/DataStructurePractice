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

        public int getData() {
            return data;
        }

        public ListNode setData(int data) {
            this.data = data;
            return this;
        }

        public ListNode getPrev() {
            return prev;
        }

        public ListNode setPrev(ListNode prev) {
            this.prev = prev;
            return this;
        }

        public ListNode getNext() {
            return next;
        }

        public ListNode setNext(ListNode next) {
            this.next = next;
            return this;
        }
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
        }

        return list;
    }

    public static void main(String[] args) {


    }
}
