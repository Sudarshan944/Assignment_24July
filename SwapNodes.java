/*
 * Question 11: Swap Nodes in Pairs

Skill Mapping: Basic

Description: Solve the LeetCode Problem given as a link below -

https://leetcode.com/problems/swap-nodes-in-pairs/
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        int temp;
        ListNode current = head;
        if(current==null)return null;
        while(current!=null){
            if(current.next==null)break;
            temp=current.next.val;
            current.next.val=current.val;
            current.val=temp;
            current=current.next.next;
        }return head;
    }
}