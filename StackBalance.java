/*
 * Question 8: Java Stack

Skill Mapping: Basic

Description: Solve the HackerRank Problem given as a link below -

https://www.hackerrank.com/challenges/java-stack/problem
 */
import java.util.*;

public class StackBalance {

    public static boolean balance(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == '}' && top != '{') || (c == ']' && top != '[') || (c == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) { // end with ctrl+z
            String s = scan.nextLine();
            System.out.println(balance(s) ? "true" : "false");
        }scan.close();
    }
}
