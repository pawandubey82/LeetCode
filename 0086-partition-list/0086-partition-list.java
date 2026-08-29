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
    public ListNode partition(ListNode head, int x) {
        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;

        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;

        ListNode temp = head;
        while(temp != null){
            if(temp.val < x){
                ListNode nodeToInsert = temp;
                temp = temp.next;
                nodeToInsert.next = null;

                // Insert at tail -> less wala ll me
                lesserTail.next = nodeToInsert;
                lesserTail = nodeToInsert;
            }
            else{
                ListNode nodeToInsert = temp;
                temp = temp.next;
                nodeToInsert.next = null;

                // insert at tail -> greater wali ll
                greaterTail.next = nodeToInsert;
                greaterTail = nodeToInsert;
            }
        }
        // Join bothlist and remove dummy node
        lesserTail.next = greaterHead.next;
        greaterTail.next = null;
        lesserHead = lesserHead.next;

        return lesserHead;
    }
}