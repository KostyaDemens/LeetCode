package org.example.EasyLevel;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    /*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     Given a roman numeral, convert it to an integer.*/
    Map<Character, Integer> map = new HashMap<>();

    {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

    }

    public int romanToInt(String s) {
        int result = 0;
        int previous = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            int current = map.get(s.charAt(i));
            if (current < previous) {
                result -= current;
            } else {
                result += current;
            }
            previous = current;
        }
        return result;
    }
}
