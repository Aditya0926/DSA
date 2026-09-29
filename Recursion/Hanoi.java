package Recursion;

public class Hanoi {
    public static void towerOfHanoi(int n , String src , String helper , String dest){
        if(n==1){
            System.out.println("move disc from " + src + " to " + dest);
            return ;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("move disc from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        towerOfHanoi(3,"A","B","C");
    }
}
