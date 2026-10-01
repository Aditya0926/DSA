package LinkedList;

public class PalindromeList {
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
        head.next.next.next = new Node(30);
        head.next.next.next.next = new Node(20);
        head.next.next.next.next.next = new Node(10);

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev = null;
        Node curr = slow.next;
        Node next;

        while (curr!=null) {
            next=curr.next;
            curr.next = prev;
            prev = curr;
            curr=next;
        }

        Node first = head;
        Node second = prev;
        while (second!=null) {
            if(first.data == second.data){
                first= first.next;
                second=second.next;
            }else{
                System.out.println("Not Palindrome");
                return ;
            }
        }
        System.out.println("Palindrome");
    }
}
