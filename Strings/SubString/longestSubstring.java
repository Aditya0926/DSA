package Strings.SubString;
import java.util.*;
public class longestSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int maxLength =0;
        for(int right =0 ; right < str.length(); right++){
            char ch1 = str.charAt(right);
            
            map.put(ch1,map.getOrDefault(ch1,0)+1);
            while(map.get(ch1) > 1){
                char ch2 = str.charAt(left);
                map.put(ch2, map.get(ch2)-1);
                if(map.get(ch2) == 0){
                    map.remove(ch2);
                }
                left++;;
            }
            int currentWindow = right - left + 1;
            maxLength = Math.max(maxLength, currentWindow);
        }
        System.out.println(maxLength);
    }
}
