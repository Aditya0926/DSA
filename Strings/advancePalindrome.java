package Strings;

public class advancePalindrome {
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        String str2="";
        str2 = str.replace(" ", "").toLowerCase();
        System.out.println(str2);
        StringBuilder sb = new StringBuilder(str2);
        String rev = sb.reverse().toString();
        System.out.println(rev);
        if( str2.equals(rev) ){
            System.out.println("Palindorme");
        }else{
            System.out.println("Not Palindorme");
        }
    }
}
