/*
 * Question 7: Longest Palindromic Substring

Skill Mapping: Medium

Description: Solve the LeetCode Problem given as a link below -

https://leetcode.com/problems/longest-palindromic-substring/

 */
import java.util.*;
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        int maxLen = 1;
        int start = 0, end = 0;

        if (s == null || s.length() <= 1) {
            return s;
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int l = i, r = i;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }
            if (maxLen < (r - l - 1)) {
                maxLen = r - l - 1;
                start = l + 1;
                end = r - 1;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            int l = i, r = i + 1;
            while (l >= 0 && r < s.length()) {
                if (s.charAt(l) == s.charAt(r)) {
                    l--;
                    r++;
                } else {
                    break;
                }
            }
            if (maxLen < (r - l - 1)) {
                maxLen = r - l - 1;
                start = l + 1;
                end = r - 1;
            }
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        LongestPalindrome solution = new LongestPalindrome();
        String result = solution.longestPalindrome(input);
        scan.close();
        System.out.println("Longest Palindromic Substring: " + result);
    }
}