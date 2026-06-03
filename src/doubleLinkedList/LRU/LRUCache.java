package doubleLinkedList.LRU;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

        int capacity;
        ListNode head = new ListNode(-1, -1);
        ListNode tail = new ListNode(-1, -1);

        Map<Integer, ListNode> map;

    public LRUCache(int capacity) {

        this.capacity = capacity;

        this.map = new HashMap<>();

        head.next = tail;
        tail.prev = head;
    }

    /* Insert node immediately after head.

       Before:
       head <-> firstNode

       After:
       head <-> node <-> firstNode

       Newly inserted node becomes
       Most Recently Used (MRU).
    */
        public void addNode(ListNode node) {

        ListNode nextNode = head.next;

        head.next = node;
        node.prev = head;

        node.next = nextNode;
        nextNode.prev = node;
    }

    /* Remove node from DLL.

       Before:
       prevNode <-> node <-> nextNode

       After:
       prevNode <-> nextNode

       Time Complexity: O(1)
    */
        public void deleteNode(ListNode node) {

        ListNode prevNode = node.prev;
        ListNode nextNode = node.next;

        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    /* GET Operation

       If key exists:
       1. Retrieve node
       2. Move node to MRU position
       3. Return value

       If key does not exist:
       Return -1
    */
        public int get(int key) {

        if (!map.containsKey(key))
            return -1;

        ListNode node = map.get(key);

        /* Move accessed node to front */
        deleteNode(node);
        addNode(node);

        return node.val;
    }

    /* PUT Operation

       Case 1:
       Key already exists
       -> Update value
       -> Move node to MRU position

       Case 2:
       Key does not exist
       -> Create new node
       -> Insert at MRU position

       If cache exceeds capacity:
       -> Remove Least Recently Used node
       -> Remove key from HashMap
    */
        public void put(int key, int value) {

        /* Existing key */
        if (map.containsKey(key)) {

            ListNode node = map.get(key);

            /* Update value */
            node.val = value;

            /* Move to MRU position */
            deleteNode(node);
            addNode(node);

            return;
        }

        /* Cache full */
        if (map.size() == capacity) {

            /* LRU node is before tail

               head <-> ... <-> LRU <-> tail
            */
            ListNode lru = tail.prev;

            deleteNode(lru);

            map.remove(lru.key);
        }

        /* Create new node */
        ListNode newNode =
                new ListNode(key, value);

        /* Insert as MRU */
        addNode(newNode);

        /* Store in HashMap */
        map.put(key, newNode);
    }


}
