public class findElem {
    public static void main(String[] args) {
        int arr[] = {10,45,7,42,18,30};
        int target = 42;
        boolean isfound=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                isfound =true;
                System.out.println("Element found at index = " + i);
                break;
            }
        }
        if(!isfound){
            System.out.println("not found");
        }
    }
}
