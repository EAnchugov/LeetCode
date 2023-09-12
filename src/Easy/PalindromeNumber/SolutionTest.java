package Easy.PalindromeNumber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void test(){
        Assertions.assertTrue(solution.isPalindrome(121));
    }

    @Test
    void test2(){
        Assertions.assertFalse(solution.isPalindrome(-121));
    }
}