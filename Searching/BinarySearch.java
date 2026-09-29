package Searching;

public class BinarySearch {
    public static int binaryIndexSearch(int arr[],int low , int high , int target){
        while (low<=high) {
            int mid = low + (high-low) /2;
            if( arr[mid] == target){
                return mid;
            }else if(target < arr[mid]){
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int n=arr.length;
        int idx = binaryIndexSearch(arr, 0, n-1 ,16);
        System.out.println(idx);
        
    }
}
