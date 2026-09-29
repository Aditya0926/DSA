package Strings.SubString;

public class longestPalindromicSubstring {
    public static void main(String[] args) {
        String str = "cbbd";
        int maxLength = 0;
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                String sub = str.substring(i, j + 1);
                int left = 0;
                int right = sub.length() - 1;
                boolean isPalindrome = true;
                while (left < right) {
                    if (sub.charAt(left) == sub.charAt(right)) {
                        left++;
                        right--;
                    } else {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome && sub.length() > maxLength) {
                    maxLength = Math.max(sub.length(), maxLength);
                    longest = sub;
                }
            }
        }
        System.out.println("longest substring is: " +"'" + longest+"'" + " with length : "+ maxLength);
    }
}
