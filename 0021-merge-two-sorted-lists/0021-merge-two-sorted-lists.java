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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();// yek dummy node create kar rahe hai take jo final result ka staring point banne me help kare ga 
        ListNode cur = dummy;//"cur" ykk pointer hai jo baata ta hai ke abb current node konse pointer pe hai 

        // jab thak list me node bache hain tab tak ye loo[ chale ga ]
        while ( list1 != null && list2 != null){
            // agr list 1 ke value badi hai list 2 ke value se 
            if( list1.val > list2.val){
                cur.next = list2;
                list2 = list2.next;// list2 ke pointer ko uske agle node par bhej do
            }else{
                cur.next = list1;
                list1 = list1.next;// list1 ke pointer ko uske agle node par bhej do
            }
            cur = cur.next;// curr node ko age bada do tahke agle node sahi se jagaha jud jaye 
        }
        cur.next = (list1 != null) ? list1 : list2; // jab yk listf katam hoo jaye to bachi huvi list ko sida cur.next me jod do 
        return dummy.next;
    }
}