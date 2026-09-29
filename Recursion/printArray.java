package Recursion;

public class printArray {
    public static void PrintArr(int arr[],int index){
        if(index == arr.length){
            return ;
        }
        System.out.println(arr[index]);
        PrintArr(arr, index+1);
    }
    public static void PrintRevArr(int arr[],int length){
        if(length == -1){
            return ;
        }
        System.out.println(arr[length]);
        PrintRevArr(arr, length-1);
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length-1;
        PrintArr(arr, 0);
        PrintRevArr(arr,n);
    }
}
