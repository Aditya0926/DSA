package HashMap;
import java.util.*;
public class twoSum {
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 17;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int needed = target -current;

            if(map.containsKey(needed)){
                System.out.println("pair found at :" + i );
                break;
            }
            map.put(arr[i],i);
        }
    }
}
