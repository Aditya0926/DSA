package HashMap;
import java.util.*;
public class mostFreqElement {
    public static void main(String[] args) {
        int arr[] = {4, 2, 4, 3, 2, 4, 2, 5};
        HashMap<Integer,Integer> map =new HashMap<>();
        for( int num : arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int maxFreq=0;
        int mostFreqElement=arr[0];
        HashSet<Integer> visited =new HashSet<>();
        for (int num : arr) {
            
            if (visited.contains(num)){
                continue;
            }
            visited.add(num);
            if(map.get(num) > maxFreq){
                maxFreq = map.get(num);
                mostFreqElement = num;
            }
        }
        System.out.println("most freq element = "+ mostFreqElement + " with frequency =" + maxFreq);
    }
}
