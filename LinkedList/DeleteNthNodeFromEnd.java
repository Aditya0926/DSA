package LinkedList;

public class DeleteNthNodeFromEnd {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node slow = head ;
        Node fast = head ;
        
        int n = 2 ;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }

        while (fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        System.out.println(slow.data);
        slow.next = slow.next.next;
        System.out.println();
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
