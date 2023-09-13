package Easy.validParentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1(){
        Assertions.assertTrue(solution.isValid("()"));
    }
    @Test
    void test2(){
        Assertions.assertTrue(solution.isValid("()[]{}"));
    }
    @Test
    void test3(){
        Assertions.assertFalse(solution.isValid("(]"));
    }

    @Test
    void test4(){
        Assertions.assertTrue(solution.isValid("{[]}"));
    }

    @Test
    void test5(){
        Assertions.assertFalse(solution.isValid("]"));
    }

}