public class firstOccurence {
    public static void main(String[] args) {
        int arr[] = {5,8,2,8,10,8};
        int target = 8;
        boolean isPresent = false;
        for (int i = arr.length-1; i>=0; i--) {
            if(arr[i]==target){
                isPresent = true;
                System.out.println("found at index = " + i);
                break;
            }
        }
        if(!isPresent){
            System.out.println("not found");
        }
    }
}
