package LinkedList;
public class IntersectionOfTwoLinkedList {
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
        head1.next = new Node(20);
        head1.next.next = new Node(30);
        head1.next.next.next = new Node(40);
        head1.next.next.next.next = new Node(50);

        Node head2 = new Node(15);
        head2.next = new Node(25);
        head2.next.next = new Node(35);
        head2.next.next.next = head1.next.next.next ;
        head2.next.next.next.next = head1.next.next.next.next;

        Node p1 = head1;
        Node p2 = head2;

        // int i1= 1;


        while (p1!=p2) {
            if(p1==null){
                p1=head2;
            }else{
                p1=p1.next;
            }

            if(p2 == null){
                p2=head1;
            }else{
                p2=p2.next;
            }
        }
        if(p1!=null){
            System.out.println("intersection: "+ p1.data);
        }else{
            System.out.println("No intersection");
        }


        // while (p1!=null) {
        //     Node p22 = head2;
        //     int i2=1;
        //     while (p22!=null ) {
        //         if(p1==p22){
        //             System.out.println("found at: " + i1 + " element is: " + p1.data);
        //             return ;
        //         }
        //         p22=p22.next;
        //         i2++;
        //     }
        //     p1=p1.next;
        //     i1++;
        // }
    }
}
