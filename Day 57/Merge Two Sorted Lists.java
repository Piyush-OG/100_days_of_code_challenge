class Solution {
    public ListNode mergeTwoLists(ListNode currA, ListNode currB) {
        if (currA == null) {
            return currB;
        } else if (currB == null) {
            return currA;
        }

        ListNode dummy = new ListNode(0);
        ListNode n = dummy;
        while (currA != null && currB != null) {
            if (currA.val < currB.val) {
                n.next = currA;
                currA = currA.next;
            } else {
                n.next = currB;
                currB = currB.next;
            }
            n = n.next;
        }

        // attach remaining elements
        n.next = (currA == null) ? currB : currA;

        return dummy.next;
    }
}
