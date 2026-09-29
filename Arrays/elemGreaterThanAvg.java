/**
 * elemGreaterThanAvg
 */
public class elemGreaterThanAvg {

    public static void main(String[] args) {
        int arr [] ={10,20,3,40,50};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        double avg = sum/ arr.length;
        System.out.println("Average = " + avg);
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>avg) {
                count++;
            }
        }
        System.out.println("No. of Element Greater than Avg ="+ count);
    }
}