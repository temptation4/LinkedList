public class Main {

    public static void main(String[] args) {

        // Common part
        ListNode common1 = new ListNode(8);
        ListNode common2 = new ListNode(4);
        ListNode common3 = new ListNode(5);

        common1.next = common2;
        common2.next = common3;

        // List A: 4 -> 1 -> 8 -> 4 -> 5
        ListNode a1 = new ListNode(4);
        ListNode a2 = new ListNode(1);

        a1.next = a2;
        a2.next = common1;

        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        ListNode b1 = new ListNode(5);
        ListNode b2 = new ListNode(6);
        ListNode b3 = new ListNode(1);

        b1.next = b2;
        b2.next = b3;
        b3.next = common1;

        Main solution = new Main();

        ListNode result = solution.getIntersectionNode(a1, b1);

        if (result != null) {
            System.out.println("Intersection Node Value: " + result.value);
        } else {
            System.out.println("No Intersection");
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {

            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }

        return p1;
    }
}