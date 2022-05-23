public class LinkedListStructure {  

    Node head;

    static class Node{
        int value;
        Node next;

        Node(int data){
            value = data;
            next = null;
        }
    }

    public static void main(String[] args){
        LinkedListStructure linkedList = new LinkedListStructure();
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        linkedList.head.next = second;
        System.out.println(second);
        second.next = third;

        while(linkedList.head != null){
            System.out.println(linkedList.head.value + " ");
            linkedList.head = linkedList.head.next;
        }
    }
}
