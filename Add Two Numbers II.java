class Solution {
    public ListNode addTwoNumbers(ListNode m, ListNode n) {
        if (m == null) {
            return n;
        } else if (n == null) {
            return m;
        }

        Deque<Integer> deque1 = new ArrayDeque(); // use as a stack
        Deque<Integer> deque2 = new ArrayDeque(); // use as a stack

        while (m != null) {
            deque1.push(m.val);
            m = m.next;
        }
        while (n != null) {
            deque2.push(n.val);
            n = n.next;
        }

        int carry = 0;
        ListNode dummy = new ListNode(0); // 1 Node before the actual head of list
        while (!deque1.isEmpty() || !deque2.isEmpty() || carry != 0) {
            int value = carry;
            if (!deque1.isEmpty()) {
                value += deque1.pop();
            }
            if (!deque2.isEmpty()) {
                value += deque2.pop();
            }
            int digit = value % 10;
            carry = value / 10;
            ListNode head = new ListNode(digit);
            head.next = dummy.next;
            dummy.next = head;
        }
        return dummy.next;
    }
}
