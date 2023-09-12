package Easy.longestCommonPrefix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    String[] string = new String[]{"ab", "a"};

    @Test
    void test() {
        Assertions.assertEquals("a", solution.longestCommonPrefix(string));
    }

}