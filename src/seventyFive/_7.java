package seventyFive;

import java.util.HashMap;
import java.util.Map;

public class _7 {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sa.length; i++) {
            Character ch = sa[i];
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        for (int i = 0; i < ta.length; i++) {
            Character tc = ta[i];
            if (map.containsKey(tc)) {
                map.put(tc, map.get(tc) - 1);
            } else {
                return false;
            }
        }
        for (Integer i : map.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
