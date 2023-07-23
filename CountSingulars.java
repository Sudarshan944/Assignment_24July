
/*
 * Question 3: Find the count of singulars in array -

Skill Mapping: Expert

Description: Consider data with assorted details of socks pair IDs. Each element in the array represents a number of similar pairs. You will have to find out how many singular socks are present which do not have any pair left.

Sample input: arrNum = {10, 20, 20, 10, 10, 30, 50, 10, 20}

Output: Count of singular socks = 3

Explanation : Socks Id - 10: total count 4 => Two pairs of socks - no singular left

Socks Id - 20: total count 3 => One pair of socks - 1 singular left

Socks Id - 30: total count 1 => No pair of socks - 1 singular left

Socks Id - 50: total count 1 => No pair of socks - 1 singular left

So, Total number of Singular socks = 3
 */
import java.util.*;

public class CountSingulars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of sock");
        int N = scan.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scan.nextInt();
        }
        int singularCount = 0;

        // Create a frequency map to count occurrences of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Count the number of singular socks
        for (int count : frequencyMap.values()) {
            if (count % 2 == 1) {
                singularCount++;
            }
        }
        scan.close();
        System.out.println("Count of singular socks = " + singularCount);
    }
}
