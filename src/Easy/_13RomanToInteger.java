package Easy;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000

//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
// Instead, the number four is written as IV. Because the one is before the five we subtract it making four.
// The same principle applies to the number nine, which is written as IX.
// There are six instances where subtraction is used:
//
//I can be placed before V (5) and X (10) to make 4 and 9.
//X can be placed before L (50) and C (100) to make 40 and 90.
//C can be placed before D (500) and M (1000) to make 400 and 900.
//Given a roman numeral, convert it to an integer.


import java.util.Hashtable;

public class _13RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }


    public static int romanToInt(String s) {
        int i = 1;
        int v = 5;
        int x = 10;
        int l = 50;
        int c = 100;
        int d = 500;
        int m = 1000;
        int answer = 0;
        StringBuffer sb = new StringBuffer(s);
        for (int k = s.length(); k > 0; k--) {
            System.out.println(answer);
            String current = sb.substring(k - 1, k);
            if (current.equals("I")) {
                answer += i;
            }
            if (current.equals("V")) {
                answer += v;
                i = -1;
            }

            if (current.equals("X")) {
                answer += x;
                v = -5;
                i = -1;
            }
            if (current.equals("L")) {
                answer += l;
                v = -5;
                x = -10;
                i = -1;
            }

            if (current.equals("C")) {
                answer += c;
                v = -5;
                l = -50;
                x = -10;
                i = -1;
            }

            if (current.equals("D")) {
                answer += d;
                v = -5;
                c = -100;
                i = -1;
                x = -10;
                l = -50;
            }

            if (current.equals("M")) {
                answer += m;
                v = -5;
                d = -500;
                c = -100;
                i = -1;
                x = -10;
                l = -50;
            }
        }
        return answer;
    }
}
