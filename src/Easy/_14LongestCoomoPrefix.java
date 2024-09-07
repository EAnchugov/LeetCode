package Easy;

import java.util.Arrays;

public class _14LongestCoomoPrefix {
    static class Solution {
        public static void main(String[] args) {
            System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        }

        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);
            StringBuilder answer = new StringBuilder();
            String first = strs[0];
            String last = strs[strs.length -1];
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != last.charAt(i)){
                    return answer.toString();
                }
                answer.append(first.charAt(i));
            }
            return answer.toString();
        }
    }
}
