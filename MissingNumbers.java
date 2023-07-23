/*
 * Question 2: Find missing numbers in array -

Skill Mapping: Basic

Description: Consider an array with N number of consecutive integers, in which few numbers are missing. Find and list down these missing numbers using Java.

Sample input: arrNum = {1, 2, 4, 5, 6}

Output: 3

Sample input: arrNum = {1, 2, 3, 5, 6, 8, 10, 11, 14}

Output: 4, 7, 9, 12, 13


 */
import java.util.*;
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int N = scan.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scan.nextInt();
        }
        int c;
        Arrays.sort(arr);
        for(int i=1;i<N;i++){
            c=arr[i-1];
            while(c+1!=arr[i]){
                c++;
                list.add(c);
            }
        }
        scan.close();
        System.out.println(list.toString().replace("[","").replace("]",""));
    }
}