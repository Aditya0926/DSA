package Strings;

public class countVowels {
    public static void main(String[] args) {
        String str1 = "PROGRAMMING";
        String str = str1.toUpperCase();
        int count = 0;
        int consonant=0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
            else if(ch >= 'B' && ch <= 'Z'){
                consonant++;
            }
        }
        System.out.println(count + " " + consonant);
    }

}
