package HashMap;

import java.util.*;

public class longestConsecSeq {
    public static void main(String[] args) {
        int arr[] = {100, 4, 200, 1, 3, 2};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        int longestLength = 0;
        for(int num : arr){
            if(!set.contains(num-1)){
                int current = num;
                int currentLength = 1;
                while (set.contains(current+1)) {
                    current++;
                    currentLength++;
                }
                longestLength = Math.max(longestLength, currentLength);
            }
        }
        System.out.println(longestLength);
        
    }
}
