package Recursion;

public class printAllPermutation {
    public static void Permutation(String str,String current ,boolean used[]){
        if(current.length() == str.length()){
            System.out.println(current);
            return ;    
        }
        for(int i=0;i<str.length();i++){
            if(used[i]){
                continue;
            }
            used[i]=true;

            Permutation(str, current + str.charAt(i), used);

            used[i] = false;
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        boolean[] used = new boolean[str.length()];
        Permutation(str,"",used);
    }
}
