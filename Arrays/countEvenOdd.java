// public class countEvenOdd {
//     public static void main(String[] args) {
//         int arr[]={12,7,5,18,20,9,4};
//         int even=0;
//         int odd=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]%2==0){
//                 even+=1;
//             }else{
//                 odd+=1;
//             }
//         }
//         System.err.println(even + " " + odd);
//     }
// }

//possitive , negetive , zero

// public class countEvenOdd {
//     public static void main(String[] args) {
//         int arr[]={5,-2,0,8,-7,0,3,-1};
//         int possitive=0;
//         int negative=0;
//         int zero=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>0){
//                 possitive+=1;
//             }else if(arr[i]<0){
//                 negative+=1;
//             }else{
//                 zero+=1;
//             }
//         }
//         System.err.println(possitive + " " + negative+ " " + zero);
//     }
// }

//sum of every element
// public class countEvenOdd {
//     public static void main(String[] args) {
//         int arr[]={ 10, 20 , 30 , 40 , 50 };
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum=sum+arr[i];
//         }
//         System.err.println(sum);
//     }
// }

// average
public class countEvenOdd {
    public static void main(String[] args) {
        int arr[]={ 10, 20 , 30 , 40 , 50 };
        int sum=0;
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        double avg =  (double) sum/n;
        System.err.println(avg);
    }
}