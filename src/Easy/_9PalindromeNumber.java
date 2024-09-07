package Easy;
//Given an integer x, return true if x is a palindrome , and false otherwise.


public class _9PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0) {return false;}
        if (x == 0 ) {return  true;}
        int z = x;
        int y = 0;
        while (z > 0) {
            y = y * 10;
            int k = z % 10;
            y = y + k;
            z = (z - k) / 10;
        }
        return (x/y == y/x);
    }
}
