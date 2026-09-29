package HashMap;
import java.util.*;
public class countDistinctElementInEveryWindow {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        HashMap<Integer,Integer> map = new HashMap<>();
        // HashSet<Integer> set = new HashSet<>();
        int left=0;
        for(int right=0;right<arr.length;right++){
            map.put(arr[right], map.getOrDefault(arr[right], 0)+1);
            if((right-left+1) == k){
                System.out.println(map.size());
                map.put(arr[left], map.get(arr[left])-1);
                if(map.get(arr[left]) == 0){
                    map.remove(arr[left]);
                }
                left++;
            }
            
        }
        

    }
}
