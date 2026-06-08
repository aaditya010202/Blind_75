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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = head;
        Integer total = 0;
        while(curr!=null) {
            total++;
            curr = curr.next;
        }
        if(total == 1) return null;

        Integer removalNode = total-n+1;
        System.out.println(removalNode);
        curr = head;
        total = 0;
        if(removalNode == 1) {
            return head.next;
        }
        while(curr!=null) {
            total++;
            if(total == removalNode-1) {
                // System.out.println(curr.val);
                ListNode temp = curr.next;
                curr.next = curr.next.next;
                temp.next = null;
                break;
            }
            curr = curr.next;
        }

        return head;

    }
}
