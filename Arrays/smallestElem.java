/**
 * smallestElem
 */
// public class smallestElem {

//     public static void main(String[] args) {
//         int arr[] = {25,7,42,10,18};
//         int min = arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]<min){
//                 min=arr[i];
//             }
//         }
//         System.out.println(min);
//     }
// }


//second min distinct elem

public class smallestElem {

    public static void main(String[] args) {
        int arr[] = {10,10,5,3,3,8};
        int min = arr[0];
        int secMin= Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                secMin=min;
                min=arr[i];
            }
            else if (arr[i]>min && arr[i]<secMin) {
                secMin=arr[i];
            }
        }
        System.out.println(secMin);
    }
}