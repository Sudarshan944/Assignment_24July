/*
 * Question 4: Java Subarray

Skill Mapping: Basic

Description: Solve the HackerRank Problem given as a link below -

https://www.hackerrank.com/challenges/java-negative-subarray/problem
changed classname 
 */
import java.util.*;

public class SubArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int ns = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum < 0)
                    ns++;
            }
        }scan.close();
        System.out.println(ns);
    }
}
