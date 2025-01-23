package org.example;

public class Main {
    public static void main(String[] args) {
        class LinkedList {
            Node head;
            class Node {
                int data;
                Node next;
                Node(int i) {
                    data = i;
                    next = null;
                }
            }
            LinkedList printList(LinkedList list) {
                Node current = list.head;
                while(current!=null) {
                    System.out.println(current.data);
                    current = current.next;
                }
                return list;
            }
            public boolean hasCycle(Node headNode) {
                if(headNode==null) {
                    return false;
                }
                Node slow = headNode;
                Node fast = headNode.next;
                while(slow!=fast) {
                    if(fast==null || fast.next==null) return false;
                    slow = slow.next;
                    fast = fast.next.next;
                }
                return true;
            }
        }

    }
}