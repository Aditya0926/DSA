package Recursion;
public class printNum {
    public static void Print(int num){
        if(num == 0 ){
            return;
        }
        Print(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        Print(5);
    }
}
