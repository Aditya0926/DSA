package Recursion;

public class sortedArray {
    public static boolean isArraySorted(int arr[], int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] > arr[idx+1]){
            return false;
        }
        return isArraySorted(arr, idx+1);   
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 12, 16};
        boolean res = isArraySorted(arr,0);
        System.out.println(res);
    }
}
