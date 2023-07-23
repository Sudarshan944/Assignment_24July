/*
 * Question 5: Merge and Sort the elements in two Linked-List

Skill Mapping: Intermediate

Description: Consider two Linked-List with N number of integers in Data-Node respectively.

Task 1- WAP in Java to merge both Linked-Lists.

Task 2 - Sort the output Linked-List basis of its Data-Node in ascending order.

Sample input: Linked-List-1:- 25->35->12->4->36->48

Linked-List-2:- 8->32->22->45->63->49

Output:- 4->8->12->22->25->32->35->36->45->48->49->63
 */
import java.util.LinkedList;
import java.util.Scanner;

public class MergeSort {
    public static LinkedList<Integer> mergeLinkedLists(LinkedList<Integer> list1, LinkedList<Integer> list2, int size1, int size2) {
        if (size1 == 0) return list2;
        if (size2 == 0) return list1;

        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(list1);
        result.addAll(list2);

        int temp = 0;
        int index = 0;
        for (int i = 0; i < size1 + size2 - 1; i++) {
            int min = result.get(i);
            for (int j = i + 1; j < size1 + size2; j++) {
                if (min > result.get(j)) {
                    min = result.get(j);
                    index = j;
                }
            }
            temp = result.get(i);
            result.set(i, min);
            result.set(index, temp);
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            int size1, size2;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the first linked list: ");
            size1 = sc.nextInt();
            System.out.println("Enter the size of the second linked list: ");
            size2 = sc.nextInt();
            if (size1 == 0 && size2 == 0) {
                System.out.println("No elements found");
            };

            LinkedList<Integer> list1 = new LinkedList<>();
            LinkedList<Integer> list2 = new LinkedList<>();
            System.out.println("Enter elements for the first linked list:");
            for (int i = 0; i < size1; i++)
                list1.add(sc.nextInt());

            System.out.println("Enter elements for the second linked list:");
            for (int i = 0; i < size2; i++)
                list2.add(sc.nextInt());
                sc.close();
            LinkedList<Integer> mergedList = mergeLinkedLists(list1, list2, size1, size2);
            System.out.println("Elements after merging is: ");
            for (Integer i : mergedList)
                System.out.print(i + "->");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
