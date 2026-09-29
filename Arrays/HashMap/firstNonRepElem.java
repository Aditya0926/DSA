package HashMap;

import java.util.HashMap;

public class firstNonRepElem {
    public static void main(String[] args) {
        int arr[]= {10,20,10,30,20,10,40,30};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int firstNonRepElement = arr[0];
        for( int i : map.keySet()){
            if(map.get(i)== 1){
                firstNonRepElement = i;
            }
        }
        System.out.println("first non repeating element :" + firstNonRepElement);
    }
}
