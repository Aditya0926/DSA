package HashMap;
import java.util.*;
public class majorityElement {

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 1, 1, 2, 2};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i: map.keySet()){
            if(map.get(i) > arr.length/2){
                System.out.println("Majority Element :" + i);
                break;
            }
        }
    }
}