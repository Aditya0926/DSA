package HashMap;
import java.util.*;
public class commonElements {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4};
        int arr2[] = {2, 2, 4, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1){
            set.add(num);
        }
        HashSet<Integer> printed = new HashSet<>();
        for(int num : arr2){
            if(set.contains(num)){
                printed.add(num);
            }
        }
        for(int num : printed){
            System.out.println(num);
        }
    }
}
