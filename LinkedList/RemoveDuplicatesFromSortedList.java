package LinkedList;

public class RemoveDuplicatesFromSortedList {
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
        head.next.next = new Node(20);
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(30);
        head.next.next.next.next.next = new Node(40);

        Node current = head;
        while (current!=null && current.next!=null) {
            if(current.data==current.next.data){
                current.next= current.next.next;
            }else{
                current=current.next;
            }
        }
        Node temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
