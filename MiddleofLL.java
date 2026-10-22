
public class MiddleofLL {

    // Node of a linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Detect whether the linked list contains a cycle
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move 1 step
            fast = fast.next.next;     // Move 2 steps

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        // Create nodes: 1 -> 2 -> 3 -> 4
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        // Connect nodes
        first.next = second;
        second.next = third;
        third.next = fourth;

        // Create a cycle: node 4 points back to node 2
        fourth.next = second;

        // Check for cycle
        if (hasCycle(first)) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle");
        }
    }
}
