package Recursion;

public class searchElement {
    public static int Search(int arr[],int idx,int target){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == target){
            return idx;
        }
        return Search(arr, idx+1, target);
    }
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 42, 18};
        int idx = Search(arr,0,42);
        System.out.println(idx);
    }
}
