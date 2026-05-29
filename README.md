# Linked List Interview Problems in Java

This repository contains Java implementations of commonly asked Linked List problems from LeetCode and technical interviews.

## Implemented Operations

### Basic Linked List Operations

* Insert at Beginning
* Insert at End
* Delete Node
* Search Element
* Print Linked List
* Reverse Linked List

### Cycle Detection

* Detect Cycle in Linked List (Floyd's Tortoise and Hare Algorithm)

### LeetCode Problems

| Problem                               | Difficulty |
| ------------------------------------- | ---------- |
| Reverse Linked List (206)             | Easy       |
| Linked List Cycle (141)               | Easy       |
| Middle of the Linked List (876)       | Easy       |
| Remove Nth Node From End of List (19) | Medium     |
| Merge Two Sorted Lists (21)           | Easy       |

## Project Structure

```text
LinkedList/
│
├── Node.java
├── LinkedList.java
├── ReverseLinkedList.java
├── DetectCycle.java
├── MergeTwoSortedLists.java
├── MiddleOfLinkedList.java
└── RemoveNthNodeFromEnd.java
```

## Algorithms Used

### Two Pointer Technique

Used in:

* Middle of the Linked List
* Linked List Cycle
* Remove Nth Node From End

### Floyd's Cycle Detection Algorithm

Used to detect cycles in O(n) time and O(1) space.

### Dummy Node Technique

Used in:

* Merge Two Sorted Lists
* Remove Nth Node From End

## Time Complexity

| Operation              | Time Complexity |
| ---------------------- | --------------- |
| Insert at Beginning    | O(1)            |
| Insert at End          | O(n)            |
| Delete Node            | O(n)            |
| Search                 | O(n)            |
| Reverse Linked List    | O(n)            |
| Detect Cycle           | O(n)            |
| Find Middle Node       | O(n)            |
| Merge Two Sorted Lists | O(m+n)          |

## How to Run

Clone the repository:

```bash
git clone https://github.com/temptation4/LinkedList.git
```

Navigate to the project:

```bash
cd LinkedList
```

Compile:

```bash
javac *.java
```

Run:

```bash
java LinkedList
```

## Learning Goals

This repository is intended for:

* Data Structures and Algorithms practice
* LeetCode preparation
* Java interview preparation
* Understanding Linked List patterns

## Future Enhancements

* Palindrome Linked List
* Linked List Cycle II
* Add Two Numbers
* Merge K Sorted Lists
* Reverse Nodes in K Group
* LRU Cache Implementation

## Author

Neelu Sahai

Java Developer | Data Structures & Algorithms Enthusiast
