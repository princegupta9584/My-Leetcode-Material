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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reverse to slow to last node 
        ListNode first = head;
        ListNode second = reverseList(slow.next);
        slow.next = null;
        while(second!=null){
            ListNode temp = first.next;
            ListNode temp2 = second.next;
            first.next = second;
            
            second.next = temp;
            second = temp2;
            first = temp;
        }
    
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode pres = head;
        ListNode nextnode = null;

        while(pres != null){
            nextnode = pres.next;
            pres.next = prev;
            prev = pres;
            pres = nextnode;
        }
        return prev;
    }
}