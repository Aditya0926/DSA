package Recursion;

public class allSubsequence {
    public static void SubSequence(String str, int index ,String current){
        if(index == str.length()){
            System.out.println(current);
            return ;
        }
        //take
        SubSequence(str, index+1,current+str.charAt(index));
        SubSequence(str, index+1, current);
    }
    public static void main(String[] args) {
        String str = "abc";
        SubSequence(str,0,"");
    }
}
