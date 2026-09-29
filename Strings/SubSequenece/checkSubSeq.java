package Strings.SubSequenece;

public class checkSubSeq {
    public static void main(String[] args) {
        String str = "abcde";
        String sub = "ace";
        int i =0 ;
        int j =0;
        while (i<str.length() && j<sub.length()) {
            if(str.charAt(i) == sub.charAt(j)){
                i++;
                j++;
                if(j== sub.length()){
                    System.out.println("SubSequenece Exist");
                    return ;
                }
            }else{
                i++;
            }
        }
        System.out.println("SubSequenece Not Exist");
    }
}
