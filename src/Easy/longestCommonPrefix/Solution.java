package Easy.longestCommonPrefix;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length < 2) {
            return strs[0];
        }
        Arrays.sort(strs);
        int firstLength = strs[0].length();
        int lastLength = strs[strs.length-1].length();
        int substringLength = Math.min(firstLength,lastLength);
        int answer = 0;
        while (answer < firstLength && answer < substringLength){
            if (strs[0].charAt(answer) == strs[strs.length-1].charAt(answer)){
             answer++;
            } else {
                break;
            }
        }
        return strs[0].substring(0,answer);
    }
}
