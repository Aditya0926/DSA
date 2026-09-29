package HashMap;
import java.util.*;
public class removeDuplicateFromArray {
    public static void main(String[] args) {
        //Hash set --> unordered result
        //LinkedHash set --> ordered result
        int arr[] = {10, 20, 10, 30, 20, 40, 10};
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for (int num : set) {
            System.out.println(num + " added");
        }
    }
}
