package seventyFive;

public class _8 {
    public static void main(String[] args) {
        int[] test = {-1, 0, 3, 5, 9, 12};
        System.out.println(search(test, 9));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }

        while (true) {
            if (nums[left] == target) {
                return left;
            }
            if (nums[right] == target) {
                return right;
            }
            int current = (left + right) / 2;
            if (right - left == 1) {
                return -1;
            }
            if (nums[current] == target) {
                return current;
            }
            if (nums[current] < target) {
                left = current;
            }
            if (nums[current] > target) {
                right = current;
            }
        }
    }
}
