/*
https://youtu.be/T_B7ydqt5Y8
*/
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
        Deque<ListNode> dq = new ArrayDeque<>();//
        ListNode tem = head;
        while(tem != null){
            dq.addLast(tem);
            tem = tem.next;
        }
        //dq == 1, 2 , 3 ,4 ,5;
        int n = dq.size();
        tem = null;
        head = tem;
        for(int i=0;i<n;i++){
            if(i%2 == 0){
                if(tem == null){
                    tem = dq.pollFirst();
                    
                }
                else {
                    tem.next = dq.pollFirst();
                    tem = tem.next;
                }
            }
            else {
                tem.next = dq.pollLast();
                tem = tem.next;
            }
            tem.next = null;
        }
        /*
        1 - 5 - 2 - 4 - 3- null
        */
        
        
    }
}
