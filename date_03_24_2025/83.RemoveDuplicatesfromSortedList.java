//83. Remove Duplicates from Sorted List

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) { 
            return null;
        }
        ListNode prev = head;
        ListNode temp = prev.next;

        while (temp != null) {
            if (temp.val == prev.val) {
                temp = temp.next;
            } else {
                prev.next = temp; 
                prev = temp;
                temp = temp.next;
            }
        }

        prev.next = null; 
        return head;
    }
}
