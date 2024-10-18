package seventyFive;

import java.util.Stack;

public class _2 {
    public static void main(String[] args) {
        System.out.println(isValid("([])"));
    }
    public static boolean isValid(String s) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' ||s.charAt(i) == '['){
                characters.push(s.charAt(i));
                continue;
            }
            if (characters.isEmpty()){
                return false;
            }

            if (s.charAt(i) == ')') {
                if (characters.pop() != '('){
                    return false;
                }
            }

            if (s.charAt(i) == ']') {
                if (characters.pop() != '['){
                    return false;
                }
            }

            if (s.charAt(i) == '}') {
                if (characters.pop() != '{'){
                    return false;
                }
            }
        }
        return characters.isEmpty();
    }
}
