package LinkedList;

public class MergingTwoSortedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args) {
        Node head1 = new Node(10);
        head1.next = new Node(30);
        head1.next.next = new Node(50);

        Node head2 = new Node(20);
        head2.next = new Node(40);
        head2.next.next = new Node(60);
        head2.next.next.next = new Node(70);

        Node dummy = new Node(0);
        Node tail = dummy;

        while (head1!=null && head2!=null) {
            if(head1.data <= head2.data){
                tail.next = head1;
                head1 = head1.next;
            }else{
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        //for remaining elements
        while (head1!=null) {
            tail.next=head1;
            head1=head1.next;
            tail=tail.next;
        }
        while (head2!=null) {
            tail.next=head2;
            head2=head2.next;
            tail=tail.next;
        }

        Node temp = dummy.next;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
