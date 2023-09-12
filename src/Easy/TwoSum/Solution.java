package Easy.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

//Дан массив целых чисел nums и целое число target. Вернуть индексы двух чисел в массиве, сумма которых равна target.
//        Можно предположить, что каждый входной массив имеет ровно одно решение, и нельзя использовать один и тот же элемент дважды.
//        Ответ можно вернуть в любом порядке.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int first = 0;
        int second = 1;
        int window = 1;
        while(true) {
            if(nums[first] + nums[second] == target) {
                break;
            } else if (second == nums.length - 1) {
                window++;
                first = 0;
                second = window;
            } else {
                first++;
                second++;
            }
        }
        return new int[]{first, second};
    }
}