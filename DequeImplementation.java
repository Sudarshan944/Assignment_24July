/*
 * Question 9: Java Dequeue

Skill Mapping: Basic

Description: Solve the HackerRank Problem given as a link below -

https://www.hackerrank.com/challenges/java-dequeue/problem


 */
import java.util.*;

public class DequeImplementation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Deque<Integer> deque = new LinkedList<>(); // Using LinkedList to store the input sequence
        HashSet<Integer> set = new HashSet<>(); // Using HashSet to keep track of unique integers
        int N = scan.nextInt(); // Number of integers in the input sequence
        int M = scan.nextInt(); // Size of the contiguous subarray
        int maxc = 0; // Variable to store the maximum number of unique integers in any subarray
        
        for (int i = 0; i < N; i++) {
            int num = scan.nextInt();
            deque.add(num); // Reading integers and adding them to the Deque
            set.add(num); // Adding them to the HashSet to keep track of unique integers
            if (deque.size() > M) {
                int removedNum = deque.removeFirst(); // Remove the first element of the deque
                if (!deque.contains(removedNum)) {
                    set.remove(removedNum); // Remove the number from the HashSet if it's no longer in the deque
                }
            }
            if (set.size() > maxc) {
                maxc = set.size(); // Update maxc if necessary
            }
        }scan.close();
        System.out.println(maxc); // Print the maximum number of unique integers in any subarray
    }
}
