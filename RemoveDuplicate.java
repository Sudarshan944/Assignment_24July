/*
 * Question 6: Remove Duplicates from Linked-List

Skill Mapping: Intermediate

Description: Consider a Linked-List with N number of repeated integers in Data-Node.

Task - WAP in Java to remove the repeated integer numbers from Linked-List.

Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5

Output:- 2->5->12->3->1
 */
import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    public void insertNode(int val) {
        ListNode newNode = new ListNode(val);
        ListNode current = this;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
}

public class RemoveDuplicate {

    public static ListNode removeDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        HashSet<Integer> uniqueElements = new HashSet<>();
        ListNode current = head;
        ListNode previous = null;

        while (current != null) {
            if (uniqueElements.contains(current.val)) {
                previous.next = current.next;
            } else {
                uniqueElements.add(current.val);
                previous = current;
            }
            current = current.next;
        }

        return head;
    }

    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a new instance of the ListNode class
        ListNode head = new ListNode(2);

        // Use the insertNode method to insert nodes
        head.insertNode(5);
        head.insertNode(12);
        head.insertNode(2);
        head.insertNode(3);
        head.insertNode(5);
        head.insertNode(1);
        head.insertNode(2);
        head.insertNode(5);
        head.insertNode(5);

        System.out.println("Input Linked List:");
        printLinkedList(head);

        ListNode newHead = removeDuplicates(head);

        System.out.println("Output Linked List:");
        printLinkedList(newHead);
    }
}
