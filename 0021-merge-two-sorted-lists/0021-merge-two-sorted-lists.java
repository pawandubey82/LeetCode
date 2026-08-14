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
    //     if(l1 == null) return l2;
    //     if(l2 == null) return l1;
    //     if(l1.val < l2.val){
    //         l1.next = mergeTwoLists(l1.next, l2);
    //         return l1;
    //     }
    //     else{
    //         l2.next = mergeTwoLists(l2.next, l1);
    //         return l2;
    //     }

        ListNode dummy = new ListNode(-1);
        ListNode ansHead = dummy;
        ListNode ansTail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
              ansTail.next = list1;
              list1 = list1.next;
              ansTail = ansTail.next;  
            }
            else{
                ansTail.next = list2;
                list2 = list2.next;
                ansTail = ansTail.next;
            }
        }
        // Ek list fully consume ho gya ek baki hai
        if(list1 != null){
            ansTail.next = list1;
        }
        if(list2 != null){
            ansTail.next = list2;
        }

        // dummy node ko remove
        ansHead = ansHead.next;
        dummy.next = null;
        return ansHead;
     }
}