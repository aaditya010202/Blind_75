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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode first = list1;
        ListNode second = list2;
        ListNode ans = new ListNode();
        if(list1 == null) return list2;
        else if(list2 == null) return list1;

        if(first.val<=second.val) {
            ans= first;
            first = first.next;
        } else {
            ans = second;
            second = second.next;
        }
        ListNode t = ans;
        while(first != null && second != null) {
            if(first.val <= second.val) {
                ans.next = first;
                first = first.next;
            } else {
                ans.next = second;
                second = second.next;
            }
                ans = ans.next;
        }

        while(first != null) {
            ans.next = first;
            ans = ans.next;
            first = first.next;
        }

        while(second != null) {
            ans.next = second;
            ans = ans.next;
            second = second.next;

        }
        return t;

    }
}