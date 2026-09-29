package Strings;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        if(str1.length() != str2.length()){
            System.out.println("Not anagram");
        }
        else{
            for(int i = 0 ;i < str1.length() ; i++){
                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(i);
                map1.put(ch1, map1.getOrDefault(ch1,0)+1);
                map2.put(ch2, map2.getOrDefault(ch2,0)+1);
            }
            if( map1.equals(map2) ){
                System.out.println("anagram");    
            }else{
                System.out.println("Not anagram");
            }
        }
        

    }
}
