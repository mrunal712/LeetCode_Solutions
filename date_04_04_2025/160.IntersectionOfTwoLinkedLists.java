//160. Intersection of Two Linked Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA==null || headB==null){return null;}

        ListNode firstList=headA;
        ListNode secondList=headB;

        while(firstList!=secondList)
        {
            firstList=firstList.next;
            secondList=secondList.next;
            if(firstList==secondList)
            {
                return firstList;
            }

            if(firstList==null)firstList=headB;
            if(secondList==null)secondList=headA;
        }
        
        return firstList;
    }
}
