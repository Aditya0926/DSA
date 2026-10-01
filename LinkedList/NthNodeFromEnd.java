package LinkedList;

public class NthNodeFromEnd {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node slow = head;
        Node fast = head;
        
        int Nth_Element = 2; //from last

        for(int i=0;i<Nth_Element;i++){
            fast=fast.next;
        }

        while (fast != null ) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println(slow.data);
    }


}
