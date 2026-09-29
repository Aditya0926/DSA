package HashMap;
import java.util.*;
public class appearMoreThanOnceElem {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40, 10, 50, 30};
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for (int num : arr) {
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }
        // for(int num : arr){
        //     if(map.get(num) > 1){
        //         System.out.println(num);
        //     }
        // }
        // HashSet<Integer> set =new HashSet<>();
        // for (int num : arr) {
        //     if(set.contains(num)){
        //         System.out.println("element appeared more than once is :" + num);
        //     }
        //     set.add(num);
        // }
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0)+1);
            
        }
        for (int i : map.keySet()) {
            if(map.get(i) >1) {
                System.out.println("Duplicate Element : " + i);
            }
        }

    }
}
