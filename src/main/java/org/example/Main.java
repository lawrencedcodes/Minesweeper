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
            LinkedList insert(LinkedList list, int data) {
                Node newnode = new Node(data);
                if(list.head==null) {
                    list.head = newnode;
                } else {
                    Node last = list.head;
                    while(last.next!=null) {
                        last = last.next;
                    }
                    last.next = newnode;
                }
                return list;
            }
            void printlist(LinkedList list) {
                if (list.head==null) {
                    System.out.println("empty list");
                } else {
                    Node last = list.head;
                    while(last!=null) {
                        System.out.println(last.data);
                        last=last.next;
                    }
                }
            }
        }
    }
}