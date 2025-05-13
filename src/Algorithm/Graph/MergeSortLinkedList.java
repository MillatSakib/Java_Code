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

    Node(int d) {
        data = d;
        next = null;
    }
}

public class MergeSortLinkedList {
    Node head;

    // Utility function to print the linked list
    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Function to insert node at the end
    void push(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
            return;
        }

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = new_node;
    }

    // MergeSort function for linked list
    Node mergeSort(Node h) {
        if (h == null || h.next == null) {
            return h;
        }

        Node middle = getMiddle(h);
        Node nextOfMiddle = middle.next;

        middle.next = null; // Split the list

        Node left = mergeSort(h);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    // Utility function to merge two sorted linked lists
    Node sortedMerge(Node a, Node b) {
        if (a == null) return b;
        if (b == null) return a;

        Node result;
        if (a.data <= b.data) {
            result = a;
            result.next = sortedMerge(a.next, b);
        } else {
            result = b;
            result.next = sortedMerge(a, b.next);
        }
        return result;
    }

    // Function to find the middle of the linked list
    Node getMiddle(Node h) {
        if (h == null)
            return h;

        Node slow = h, fast = h.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Driver code
    public static void main(String[] args) {
        MergeSortLinkedList list = new MergeSortLinkedList();

        // Example values
        int[] values = {90, 23, 101, 45, 65, 23, 67, 89, 34, 23};
        for (int val : values)
            list.push(val);

        System.out.println("Unsorted Linked List:");
        list.printList(list.head);

        list.head = list.mergeSort(list.head);

        System.out.println("Sorted Linked List:");
        list.printList(list.head);
    }
}

/*
Sample Output:

Unsorted Linked List:
90 23 101 45 65 23 67 89 34 23 
Sorted Linked List:
23 23 23 34 45 65 67 89 90 101 
*/