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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!= null){
            list.add(temp.val);
            temp = temp.next;
        }

        int size = list.size()-1;
        int start = 0;
        while(start<size){
            if(list.get(size)!=list.get(start)){
                return false;
            }
            start++;
            size--;
        }
        return true;
    }
}