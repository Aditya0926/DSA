package LinkedList;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedList {
    static class Node{
        int data ;
        Node next ;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(20);
        head.next.next.next.next = new  Node(40);
        head.next.next.next.next.next = new Node(10);

        HashSet<Integer> set = new HashSet<>();
        Node curr = head;

        while (curr!=null && curr.next!=null) {
            if(set.contains(curr.next.data)){
                curr.next = curr.next.next;
            }else{
                set.add(curr.next.data);
                curr=curr.next;
            }
        }

        // Node temp = head;
        // while (temp.next!=null) {
        //     if(set.contains(temp.next.data)){
        //         temp.next = temp.next.next;
        //     }else{

        //     }
        // }
        // while (temp!=null) {
        //     if(set.contains(temp.data)){
        //         System.out.println(temp.data);
        //         set.remove(temp.data);

        //     }
        //     temp=temp.next;
        // }

        Node printNode = head;
        while (printNode != null) {
            System.out.println(printNode.data);
            printNode = printNode.next;
        }
    }
}
