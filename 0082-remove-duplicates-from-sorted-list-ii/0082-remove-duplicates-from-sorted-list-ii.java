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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);// dummy node to handel head removal 
        dummy.next = head;
        ListNode prev = dummy;

        ListNode cur = head;

        while( cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                //skip all nodess with the same value
                while(cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                 
                prev.next =  cur.next;//remove duplicates
            }else{
                prev = prev.next;// move next distinct node  
            }
            cur= cur.next;
        }
        return dummy.next; 
    }
}