package Easy.RomanToInteger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test(){
        Assertions.assertEquals(3, solution.romanToInt("III"));
    }
}