package Recursion;

public class factorial {
    public static int fact(int n){

        //base case
        if(n == 0){
            return 1;
        }
        
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int x = fact(n);
        System.out.println(x);
    }
}
