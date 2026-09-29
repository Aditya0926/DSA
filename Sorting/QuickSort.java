    package Sorting;
    public class QuickSort {
        public static int partition(int arr[] , int low , int high){
            int pivot = arr[high];
            int i = low-1 ;
        
            for(int j=low;j< high ; j++){
                if(arr[j] < pivot){
                    i++;
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp; 
                }
            }
            i++;
            int temp = arr[i];
            arr[i] = pivot;
            arr[high] = temp; 
            return i;
        }
        public static void quickSort(int arr[], int low , int high){
            if(low < high){
                int pIdx = partition(arr,low,high);
                quickSort(arr,low,pIdx-1);
                quickSort(arr,pIdx+1,high);
            }
        }
        public static void main(String[] args) {
            int[] arr = {6, 3, 8, 2, 7};
            int n = arr.length;
            quickSort(arr, 0, n-1);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }   
    }
