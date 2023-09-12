package Easy.PalindromeNumber;

public class Solution {
    public boolean isPalindrome(int x) {
        String string = String.valueOf(x);
        int begin = 0;
        int end = string.length() - 1;
        for (int i = 0; i < string.length()/2; i++){
            if (string.charAt(begin) == string.charAt(end)){
                begin++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
