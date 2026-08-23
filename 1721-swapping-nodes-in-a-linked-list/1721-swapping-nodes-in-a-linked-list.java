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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for(int i=1; i<= k-1; i++){
            first = first.next;
        }

        // First -> kth node from beggining
        ListNode temp = first.next;
        ListNode second = head;
        // move window one step at time
        while(temp != null){
            temp = temp.next;
            second = second.next;
        }

        // Second node kth node pe pahuch gya
        // Swap
        int tempValue = first.val;
        first.val = second.val;
        second.val = tempValue;

        // return head
        return head;
    }
}