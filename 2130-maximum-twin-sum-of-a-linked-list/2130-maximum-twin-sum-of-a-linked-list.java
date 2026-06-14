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
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        int j=list.size()-1;
        int result = 0;
        for(int i=0;i<list.size()/2;i++){
            int sum = list.get(i) + list.get(j);
            j--;
            result=Math.max(sum,result);
        }
        return result;
    }
}