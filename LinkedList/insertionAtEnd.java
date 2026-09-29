package LinkedList;

public class insertionAtEnd {
    static class Node{
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
        Node newNode = new Node(25);

        Node temp = head;
        while (temp.data != 20 ) {
            temp=temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        temp =head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        


    }
}
