package LinkedList;
public class traverseNodes {
    static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node forth = new Node(40);
        first.next=second;
        second.next=third;
        third.next=forth;

        Node temp=first;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}