package LinkedList;

public class creatingNodes {
    static class Node {
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

        first.next = second;

        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(second.data);
        System.out.println(second.next.data);
    }
}
