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
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode node = dummy;
        while(temp1 != null && temp2 != null){
            if(temp1.val > temp2.val){
                node.next = temp2;
                temp2 = temp2.next;
            }else{
                node.next=temp1;
                temp1= temp1.next;
            }
            node = node.next;
        }
        if(temp1 !=null){
            node.next = temp1;
            
        }
        if(temp2!= null){
            node.next = temp2;
            
        }
        return dummy.next;
    }
}