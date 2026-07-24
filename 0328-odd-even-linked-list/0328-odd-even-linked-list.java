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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode even = new ListNode(100);
        ListNode odd = new ListNode(1000);

        int index = 1;
        ListNode dummyeven = even;
        ListNode dummyodd = odd;
        while(head != null){
            if(index % 2 == 0){
                even.next = head;
                even = even.next;
            }else{
                odd.next = head;
                odd = odd.next;
            }
            index++;
            head = head.next;
        }
        even.next = null;
        odd.next = dummyeven.next;
        return dummyodd.next;
    }
}