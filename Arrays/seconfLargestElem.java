// second largest element
// public class seconfLargestElem {
//     public static void main(String[] args) {
//         int arr[] = {10, 42, 25, 18};
//         int max=arr[0];
//         int secMax=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>max){
//                 secMax=max;
//                 max=arr[i];
//             }else if(arr[i]>secMax){
//                 secMax=arr[i];
//             }
//         }
//         System.out.println(secMax);
//     }
// }

//second largest dictinct element 
public class seconfLargestElem {
    public static void main(String[] args) {
        int arr[] = {10,10,5,3};
        int max=arr[0];
        int secMax=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                secMax=max;
                max=arr[i];
            }else if(arr[i]>secMax && arr[i]<max){
                secMax=arr[i];
            }
        }
        System.out.println(secMax);
    }
}
