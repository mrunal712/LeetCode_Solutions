//92. Reverse Linked List II

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        ListNode leftNode=dummy;
        ListNode currNode=head;

        for(int i=0;i<left-1;i++)
        {
            leftNode=leftNode.next;
            currNode=currNode.next;

        }

        ListNode prevNode=null;
        ListNode marker=currNode;

        for(int i=0;i<=right-left;i++)
        {
          ListNode nextNode=currNode.next;
          currNode.next=prevNode;
          prevNode=currNode;
          currNode=nextNode;

        }

        leftNode.next=prevNode;
        marker.next=currNode;

        return dummy.next;
  }
}
