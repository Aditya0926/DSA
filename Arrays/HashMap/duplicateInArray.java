package HashMap;
import java.util.*;
public class duplicateInArray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 20, 40, 10, 50, 30};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (int num : map.keySet()) {
            if(map.get(num)  >=2){
                System.out.println("element =" + num + "frequency =" + map.get(num));
            }
        }

    }
}
