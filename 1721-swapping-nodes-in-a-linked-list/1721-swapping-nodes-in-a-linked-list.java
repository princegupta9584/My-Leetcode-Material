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
    public ListNode swapNodes(ListNode head, int k) {
         ListNode temp = head;
        ListNode slow = head;
        for(int i=1;i<k;i++){
            temp = temp.next;
        }
        ListNode first = temp;
        while(temp.next!=null){
            temp=temp.next;
            slow= slow.next;
        }
        ListNode End = slow;
        int new1 = first.val;
first.val = End.val;
End.val = new1;

        return head;
    }
}