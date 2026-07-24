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
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ListNode traverse = temp.next;
            boolean indicator = false;
            while(traverse != null){
                if(traverse.val > temp.val){
                    list.add(traverse.val);
                    indicator = true;
                    break;
                }
                traverse = traverse.next;
            }
            if(indicator == false){
                list.add(0);
            }
            temp = temp.next;
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}