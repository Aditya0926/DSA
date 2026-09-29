package Recursion;

public class firstOccurence {
    public static int Occurence(int arr[],int index,int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return Occurence(arr, index+1, target);
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 2, 9, 2};
        int idx = Occurence(arr,0,2);
        System.out.println(idx);
    }
}
