package Strings;
// import java.util.*;
public class anagramFreq26 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        int freq[] = new int[26];
        for(int i=0 ; i<str1.length() ; i++){
            char ch = str1.charAt(i);
            freq[ch - 'a']++;
        }
        for(int i=0 ; i<str2.length() ; i++){
            char ch = str2.charAt(i);
            freq[ch - 'a']--;
        }
        for(int i = 0 ; i < 26 ; i++){
            if(freq[i]!=0){
                System.out.println("Not Anagram");
                return ;
            }
        }
        System.out.println("Anagram");
    }
}
