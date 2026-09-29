package HashMap;
import java.util.*;
public class firstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 20, 50, 30};
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num : arr){
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }
        HashSet<Integer> visited = new HashSet<>();
        for(int num : arr){
            if(visited.contains(num)){
                System.out.println(num);
                break;
            }
            visited.add(num);
        }
    }
}
