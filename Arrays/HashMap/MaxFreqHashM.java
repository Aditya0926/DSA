package HashMap;
import java.util.*;

public class MaxFreqHashM {

    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 30, 20, 10, 40 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int maxFreq = 0;
        int maxFreqElem = arr[0];
        for (int i : map.keySet()) {
            if (map.get(i) > maxFreq) {
                maxFreq = map.get(i);
                maxFreqElem = i;
            }
        }
        System.out.println(maxFreqElem);
        System.out.println(maxFreq);
    }
};