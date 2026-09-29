public class oneTarget {
    public static void main(String[] args) {
        int arr[] = {10,20,10,30,10,40};
        int target =10;
        int freq=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                freq++;
            }
        }
        System.out.println(target + "occours " + freq + "times");
    }
}
