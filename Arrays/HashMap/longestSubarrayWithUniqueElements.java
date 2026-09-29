package HashMap;

import java.util.*;

public class longestSubarrayWithUniqueElements {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 2, 3, 4 };
        int left = 0;
        int currentWindow;
        int maxLength = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int right = 0; right < arr.length; right++) {
            if (set.contains(arr[right])) {
                set.remove(arr[left]);
                left++;
            }
            set.add(arr[right]);
            currentWindow = right - left + 1;
            maxLength = Math.max(currentWindow, maxLength);
        }

        System.out.println(maxLength);
    }
}
