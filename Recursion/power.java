package Recursion;

public class power {
    public static int calPower(int n , int pow){
        if(pow == 0){
            return 1;
        }
        return n * calPower(n, pow-1);
    }
    public static void main(String[] args) {
        int x = calPower(2, 5);
        System.out.println(x);
    }
}
