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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;

        int n = NoOfNodes(head);// count number of nodes in the list 

        k = k % n ;// we will wrap around "k" so that it alwasays remain less than n 

        //if no rotationn is required
        if(k ==0)
            return head;

        int count =0;
        int req = n - k;// req -> Required starting nodes of original list that will be added in the last of our answer 
        ListNode temp = head;

        while(count < req-1){
            temp =  temp.next;
            count ++;
        }

        if(temp  == null )
            return head;
        
        ListNode next =  temp.next; // Store next node in 'next' which will be the head of our answer

        temp.next = null;// To end the answer list, make sure to make the next of temp as null

        // Now traverse remaining list
        temp = next;
        while(temp.next !=  null)
            temp = temp.next;

        // and attach the end of the list to head 
        temp.next = head ;
        return next  ;
        
    }

    public int NoOfNodes(ListNode head){
        int c = 0;
        ListNode temp = head;

        while(temp != null)
        {
            c++;
            temp = temp.next;
        }
        return c;
    }

}