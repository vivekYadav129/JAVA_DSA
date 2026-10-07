class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class MySolution {

    public ListNode middleNode(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}

public class Solution {

    public static void main(String[] args) {

        // Creating:
        // 1 → 2 → 3 → 4 → 5

        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
       

        MySolution obj = new MySolution();

        ListNode middle = obj.middleNode(head);

        System.out.println("Middle node: " + middle.val);
    }
}