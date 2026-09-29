package Strings.StringBuilder;
import java.util.*;
public class hashSetSB {
    public static void main(String[] args) {
        String str = "programming";
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                sb.append(ch);
            }

        }
        System.out.println(sb);
    }
}
