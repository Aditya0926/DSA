package Strings.SubString;

public class patternMatching {
    public static void main(String[] args) {
        String text = "aabcabc";
        String pattern = "abc";
        int i = 0;
        int j = 0;
        while (i < text.length() && j < pattern.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
                if (j == pattern.length()) {
                    System.out.println(i - j);
                    return;
                }
            }
            else{
                i = i - j + 1;
                j=0;
            }
        }
    }
}
