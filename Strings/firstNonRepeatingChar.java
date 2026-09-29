package Strings;

/**
 * firstNonRepeatingChar
 */
import java.util.*;

public class firstNonRepeatingChar {

    public static void main(String[] args) {
        String str = "PROGRAMMING";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }
    }
}