/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm.Graph;

/**
 *
 * @author Sakib
 */



class Node {
    int data;
    Node next;

    Node(int item) {
        data = item;
        next = null;
    }
}

public class QuickSortUsingLinkedList {

    Node head;

    // Add node to the end of the list
    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    // Print the linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Partition the list and return pivot node
    Node partitionLast(Node start, Node end) {
        if (start == end || start == null || end == null)
            return start;

        Node pivotPrev = start;
        Node curr = start;
        int pivot = end.data;

        while (start != end) {
            if (start.data < pivot) {
                pivotPrev = curr;

                // Swap data
                int temp = curr.data;
                curr.data = start.data;
                start.data = temp;

                curr = curr.next;
            }
            start = start.next;
        }

        // Swap pivot data
        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;

        return pivotPrev;
    }

    // QuickSort recursive function
    void quickSort(Node start, Node end) {
        if (start == null || start == end || start == end.next)
            return;

        Node pivotPrev = partitionLast(start, end);
        quickSort(start, pivotPrev);

        if (pivotPrev != null && pivotPrev == start)
            quickSort(pivotPrev.next, end);
        else if (pivotPrev != null && pivotPrev.next != null)
            quickSort(pivotPrev.next.next, end);
    }

    // Find the last node of the list
    Node getTail(Node node) {
        while (node != null && node.next != null)
            node = node.next;
        return node;
    }

    // Driver code
    public static void main(String[] args) {
        QuickSortUsingLinkedList list = new QuickSortUsingLinkedList();
        list.addNode(30);
        list.addNode(3);
        list.addNode(4);
        list.addNode(20);
        list.addNode(5);

        System.out.println("Original Linked List:");
        list.printList(list.head);

        Node tail = list.getTail(list.head);
        list.quickSort(list.head, tail);

        System.out.println("Sorted Linked List:");
        list.printList(list.head);
    }
}