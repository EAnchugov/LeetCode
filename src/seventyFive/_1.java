package seventyFive;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentIndex = i;
            int currentNum = nums[i];
            int compliment = target - nums[currentIndex];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), currentIndex};
            } else {
                map.put(currentNum, currentIndex);
            }
        }
        return null;
    }
}
