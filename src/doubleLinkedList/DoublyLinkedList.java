package doubleLinkedList;

public class DoublyLinkedList {

    Node head;
    Node tail;

        void insertAtBeginning(int value){
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            }
            else{
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
        }

        void insertAtEnd(int value){
            Node newNode = new Node(value);
            if(head == null){
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        void printForward(){
            Node current = head;
            while(current != null){
                System.out.print(current.value+" ");
                current = current.next;
            }
        }

        void printBackward(){
            Node current = tail;
            while(current != null){
                System.out.print(current.value+" ");
                current = current.prev;
            }
        }

        void deleteNode(int value){
            Node current = head;

           while(current != null){
               if(current.value==value) {
                   if (current == head) {
                       head = head.next;
                       if (head != null) {
                           head.prev = null;
                       }
                       return;
                   }

                   if (current == tail) {
                       tail = tail.prev;
                       if (tail != null) {
                           tail.next = null;
                       }
                       return;
                   }
                   current.prev.next = current.next;
                   current.next.prev = current.prev;

               }
               current = current.next;

           }
        }

        void reverse(){
            Node current = head;
            Node prev = null;
            while(current != null){
                current.prev = prev;
                prev = current;
                current = current.next;
            }
        }

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();


        list.insertAtBeginning(20);
        list.insertAtBeginning(10);

        //list.printList();

        list.insertAtEnd(30);
        list.insertAtEnd(40);



       // list.printForward();
        list.deleteNode(20);
        list.printForward();

       // list.printBackward();

       /* list.delete(30);

        list.printForward();*/
    }
}
