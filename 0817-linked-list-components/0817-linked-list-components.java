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
    public int numComponents(ListNode head, int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        ListNode temp = head;
        int length = 0;
        // int len = 0;
        while(temp != null){
            if(set.contains(temp.val) && (temp.next == null || (!set.contains(temp.next.val)))){
                length++;
            }
            temp=temp.next;
        }
        return length;
    }
}