package Easy;
//        Дан массив целых чисел nums и целое число target. Верните индексы двух чисел так, чтобы они в сумме давали target.
//                Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать
//                один и тот же элемент дважды.
//        Вы можете вернуть ответ в любом порядке.

import java.util.HashMap;

public class _1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int currentNum = 0;
        int currentIndex = 0;
        int compliment;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            currentIndex = i;
            currentNum = nums[i];
            compliment = target - currentNum;
            if (hashMap.containsKey(compliment)) {
                return new int[]{hashMap.get(compliment), currentIndex};
            } else {
                hashMap.put(currentNum, currentIndex);
            }
        }
        return null;
    }
}
