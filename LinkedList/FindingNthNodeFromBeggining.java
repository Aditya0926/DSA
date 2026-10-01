package LinkedList;

public class FindingNthNodeFromBeggining {
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
        head.next =  new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        int n = 5;
        Node temp = head ;
        while (n>1) {
            temp=temp.next;
            n--;
        }
        System.out.println(temp.data);
        // for(int i= 1 ; i < n ; i++ ){
        //     temp=temp.next;
        // }
        // if(temp.next.next != null){
        //     temp.next = temp.next.next;
        // }else{
        //     temp.next=null;
        // }

        // Node Print = head;
        // while (Print!=null) {
        //     System.out.println(Print.data);
        //     Print=Print.next;
        // }
    }
}
