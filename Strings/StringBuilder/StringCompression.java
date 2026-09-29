package Strings.StringBuilder;

public class StringCompression {
    public static void main(String[] args) {
        String str = "aaabbccccd";
        StringBuilder sb = new StringBuilder("");
        int count = 1;
        for(int i = 1 ; i < str.length() ; i++){
            // char ch = str.charAt(i);
            if(str.charAt(i-1) == str.charAt(i)){
                count++;
            }
            else{
                sb.append(str.charAt(i-1));
                sb.append(count);
                count=1;
            }
        }
        sb.append(str.charAt(str.length()-1));
        sb.append(count);
        System.out.println(sb);
    }
}
