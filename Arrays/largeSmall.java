public class largeSmall {
    public static void main(String[] args) {
        int arr[]={12,5,27,3,19,8};
        int largest= Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(largest  +" "+ smallest);
    }
}
