package Strings.StringBuilder;

public class revStr {
    public static void main(String[] args) {
        String str = "PROGRAMMING";
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        System.out.println(rev);
    }
}
