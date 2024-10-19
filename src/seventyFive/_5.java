package seventyFive;

public class _5 {
    public static void main(String[] args) {

        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        char[] array = string.toCharArray();
        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(array[left])) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(array[right])) {
                right--;
                continue;
            }

            if (array[left] == array[right]) {
                left++;
                right--;
                continue;
            }
            return false;
        }
        return true;
    }
}
