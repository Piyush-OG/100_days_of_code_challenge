class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head, prev = null;
        while(n-->1)
            fast = fast.next;
        
        while(fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        
        if(prev==null)
            head = head.next;
        else
            prev.next = slow.next;
        
        return head;
    }
}
