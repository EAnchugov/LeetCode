package Easy.validParentheses;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> desk = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                desk.push(c);
            } else if (c == ')') {
                if (desk.isEmpty() ||desk.pop() != '(' ) return false;
            } else if (c ==']') {
                if (desk.isEmpty() || desk.pop() != '[' ) return false;
            } else if (c == '}') {
                if (desk.isEmpty() || desk.pop() != '{' ) return false;
            }
        }
        return desk.isEmpty();
    }
}
