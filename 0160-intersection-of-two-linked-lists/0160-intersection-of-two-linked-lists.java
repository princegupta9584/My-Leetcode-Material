/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB == null) return null;
        ListNode first = headA;
        int firstlen = 0;
        while(first!=null){
            first=first.next;
            firstlen++;
        }

        ListNode second = headB;
        int secondlen = 0;
        while(second!=null){
            second=second.next;
            secondlen++;
        }
        first = headA;
        second = headB;
        int difference = Math.abs(firstlen - secondlen);
        if(firstlen<secondlen){
            for(int i=0;i<difference;i++){
                second = second.next;
            }
        }else{
            for(int i=0;i<difference;i++){
                first = first.next;
            }
        }

        
        while(first!=second ){
            first = first.next;
            second = second.next;
        }

        return first;
    }
}