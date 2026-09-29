package Recursion;

public class countOccurences {
    public static int Count(int arr[],int index , int target){
        if(index == arr.length){
            return 0;
        }
        int total = 0;
        if(arr[index] == target){
            total = 1;
        }
        return total + Count(arr, index+1, target);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 7};
        int count = Count(arr,0,2);
        System.out.println(count);
    }
}
