package HashMap;

public class longestSubArrayWithSum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 1, 1, 3, 2};
        int k=5;
        int currentLength;
        int maxLength = 0 ;
        int left = 0 ;
        int sum = 0 ;
        for(int right = 0 ; right < arr.length ; right++){
            sum+=arr[right];
            while (sum > k) {
                sum -= arr[left];
                left++;
            }
            if( sum == k ){
                currentLength = right - left + 1;
                maxLength = Math.max(maxLength, currentLength );
            }  
        }
        System.out.println(maxLength);
    }
}
