package LinkedList;

public class SearchingForAnElement {
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
        head.next.next.next = new Node(40);

        Node temp = head;
        int target =30;
        int i=0;
        boolean Found = false;

        while (temp != null) {
            if(temp.data == target){
                System.out.println("Found at: " + i);
                Found = true;
                break;
            }
            temp = temp.next;
            i++;
        }
        if(!Found){
            System.out.println("Not Found");
        }
    }
}
