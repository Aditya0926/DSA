package HashMap;
import java.util.*;
public class longestSubArrayWithTwoDistinctElements {
    public static void main(String[] args) {
        System.out.println("Aditya");
        int arr[]={1,2,1,2,3,2,2,1};
        int left=0;
        int maxLength=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right=0 ; right< arr.length;right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            while (map.size() > 2) {
                map.put(arr[left], map.getOrDefault(arr[left], 0)-1);
                if(map.get(arr[left])== 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            if(map.size() == 2){
                int currentLength = right - left + 1;
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        System.out.println(maxLength);
    }
}
