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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        int previous = head.val;
        ListNode temp = head.next;
        int i = 1;
        while(temp != null && temp.next != null){
            if(previous < temp.val && temp.val > temp.next.val){
                list.add(i);
            }
            if(previous > temp.val && temp.val < temp.next.val){
                list.add(i);
            }
            previous = temp.val;
            i++;
            temp = temp.next;
        }
        int size = list.size();
        int minima = Integer.MAX_VALUE;
        int maxima = -1;
        if(list.size() < 2){
            return new int[]{-1, -1};
        }
        for(int j = 1;j<list.size();j++){
            if((list.get(j)-list.get(j-1))<minima){
                minima = list.get(j)-list.get(j-1);
            }
        }
        maxima = list.get(size-1)-list.get(0);
        
        return new int[]{minima, maxima};
    }
}