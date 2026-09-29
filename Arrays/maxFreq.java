public class maxFreq {
    public static void main(String[] args) {
        int arr[] = { 10,20,10,30,20,10,40};
        int maxfreqElem=arr[0];
        int count=0;
        boolean isVisited [] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(isVisited[i]){
                continue;
            }
            int k=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    isVisited[j]=true;
                    k++;
                }
            }
            if(k>count){
                maxfreqElem=arr[i];
                count=k;
            }
        }
        System.err.println("maximum frequency of element = "+ maxfreqElem + "  with frequency = " + count);
    }
}
