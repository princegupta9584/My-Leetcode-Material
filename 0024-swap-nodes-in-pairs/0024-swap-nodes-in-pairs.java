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
        if(head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null ){
            ListNode first = prev.next;
            ListNode second = prev.next.next;

            //swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
        // ListNode current = head;
        // ListNode next = head.next;

        // ListNode newhead = temp.next;
        // while(next != null && current.next != null){
        //     current.next = next.next;
        //     next.next = current;

        //     if(current.next != null){
        //         current = current.next;
        //         next = current.next;
        //     }
        // }
        // return newhead ;
    }
}