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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    //     Integer sum1 = 0;
    //     Integer sum2 = 0;
    //     Integer n=0;
    //     while(l1 != null) {
    //         sum1 += l1.val * (int)Math.pow(10,n);
    //         n++;
    //         l1=l1.next;
    //     }
    //     n=0;
    //     while(l2 != null) {
    //         sum2 += l2.val * (int)Math.pow(10,n);
    //         n++;
    //         l2=l2.next;
    //     }

    //     Integer sum3  = sum1+sum2;
    //     ListNode ans = new ListNode(sum3%10);
    //     ans.val = sum3%10;
    //     sum3=sum3/10;
    //     ListNode t = ans;
        
    //     while(sum3 != 0) {
    //         Integer temp  = sum3%10;
    //         sum3 = sum3/10;
    //         t.next = new ListNode(temp);
    //         t = t.next;
    //     }

    //     return ans;
        Integer carry = 0;
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(l1 != null || l2 != null || carry!=0) {
            Integer val1 = 0;
            Integer val2 = 0;
            if(l1 != null) val1 = l1.val;
            if(l2 != null) val2 = l2.val;
            Integer sum = 0;
            sum += val1 + val2 + carry;
            carry = sum/10;
            sum = sum%10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            if(l1!=null) l1 = l1.next;
            else l1 = null;
            if(l2!=null) l2 = l2.next;
            else l2 = null;
        }   
        return temp.next;
    }
}
