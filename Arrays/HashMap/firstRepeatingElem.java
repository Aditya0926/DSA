package HashMap;
import java.util.*;
public class firstRepeatingElem {
    public static void main(String[] args) {
        int arr[] = {10, 5, 3, 4, 3, 5, 6};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            if(set.contains(i)){
                System.out.println(i);
                break;
            }
            set.add(i);
        }
    }
}
