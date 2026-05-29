public class List {
    ListNode head;



    void insertAtBegining(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = newNode;
    }

    void print(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }

    }

    public boolean search(int value) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.value == value) {
                return true;
            }
        }
        return false;
    }

    public void delete(int value) {
        if (head == null) {
            return;
        } else   {
            // If head node needs to be deleted
            if (head.value == value) {
                head = head.next;
                return;
            }
            ListNode cur = head;
            while (cur.next != null) {
                if (cur.next.value == value) {
                    cur.next = cur.next.next;
                }
                else {
                    cur = cur.next;
                }
            }
        }

    }

    public void reverse() {
        if (head == null) {
            return;
        }
        ListNode cur = head;
        ListNode prev = null;
            while (cur != null) {
                ListNode next = cur.next;
                cur.next = prev;
                prev = cur;
                cur = next;
            }
            head = prev;
    }

    public boolean checkCycle() {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
/*Remove Nth Node From End of List
    https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/

    Input: head = [1,2,3,4,5], n = 2
    Output: [1,2,3,5] */
    public ListNode removeNthFromEnd(ListNode head, int n) {

       ListNode cur = head;
       while (cur.next != null) {
           cur = cur.next;
           if (n == cur.value) {
               cur.next = cur.next.next;
           }
       }
       return head;

    }

    /*Middle of the Linked List
    https://leetcode.com/problems/middle-of-the-linked-list/description/
    Example 1:


    Input: head = [1,2,3,4,5]
    Output: [3,4,5]
    Explanation: The middle node of the list is node 3. */

    public ListNode middleNode(ListNode head) {
          ListNode slow = head;
          ListNode fast = head;
          while (fast != null && fast.next != null) {
              slow = slow.next;
              fast = fast.next.next;
          }

      return slow;
    }

    //Merge Two Sorted Lists
    //https://leetcode.com/problems/merge-two-sorted-lists/description/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {

            if (list1.value <= list2.value) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }

            tail = tail.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummy.next;
    }

    /*Linked List Cycle
    https://leetcode.com/problems/linked-list-cycle/description/
    Example 1:


    Input: head = [3,2,0,-4], pos = 1
    Output: true
    Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).*/

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast= head;

        while(fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;

    }


    public static void main(String[] args) {
        List list = new List();

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        n4.next = n2; // cycle

        list.head = n1;

        System.out.println(list.checkCycle());
    }
}
