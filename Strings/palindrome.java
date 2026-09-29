package Strings;

public class palindrome {
    public static void main(String[] args) {
        String str = " MADAM ";
        boolean pal = true;
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }else{
                pal = false;
                break;
            }
        }
        if(pal){
            System.out.println("Palindorme");
        }else{
            System.out.println("Not Palindorme");
        }
    }
}
