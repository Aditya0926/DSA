package Recursion;

public class maxElement {
    public static int findMax(int arr[],int idx){
        if( idx == arr.length-1){
            return arr[idx];
        }
        int max = findMax(arr, idx+1);
        return Math.max(max, arr[idx]);
    }
    public static void main(String[] args) {
        int[] arr = {10, 45, 23, 67, 12};
        int x = findMax(arr, 0);
        System.out.println(x);
    }
}
