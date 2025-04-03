//61. Rotate List

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
     
public ListNode findKthNode(ListNode temp,int k)
     {
        int count=1;
        while(temp!=null)
        { 
          if(count==k){return temp;}
          count++;
          temp=temp.next;
         }

        return temp;
     }

 public ListNode rotateRight(ListNode head, int k) {
      if(head==null || k==0 || head.next==null)
        {
            return head;
        }

        ListNode tail=head;
        int length=1;

        while(tail.next!=null)
        {
        
        tail=tail.next;
        length=length+1;
        }

        if(k%length==0){return head;}
        k=k%length;
        tail.next=head;
        ListNode temp=findKthNode(head,length-k);
        head=temp.next;
        temp.next=null;

return head;
   }
}
