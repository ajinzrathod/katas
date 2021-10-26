package main;
/*
* Author: Ajinkya Rathod
 */
import java.util.LinkedHashMap;

public class Roman {
    public static String concat_n_times(int amount) {
        String s = "";
        for (int i = 0; i < amount; i++) {
            s = s.concat("I");
        }
        return s;
    }

    public static int getLowThreshold(LinkedHashMap romanMap, int amount){
        int low = 1;
        for (Object key : romanMap.keySet()) {
            int i = (int)key;
            if(amount == i){
                return i;
            }
            if(amount < i){
                return low;
            }
            low = i;
        }
        return low;
    }

    public static LinkedHashMap putRomansInLinkedHashMap() {
        LinkedHashMap<Integer, String> romanMap = new LinkedHashMap<>();

        romanMap.put(1, "I");
        romanMap.put(4, "IV");
        romanMap.put(5, "V");
        romanMap.put(9, "IX");
        romanMap.put(10, "X");
        romanMap.put(40, "XL");
        romanMap.put(50, "L");
        romanMap.put(90, "XC");
        romanMap.put(100, "C");
        romanMap.put(400, "CD");
        romanMap.put(500, "D");
        romanMap.put(900, "CM");
        romanMap.put(1000, "M");

        return romanMap;
    }

    public String Convert(int amount) {
        LinkedHashMap<Integer, String> romanMap;

        romanMap = putRomansInLinkedHashMap();

        int low = getLowThreshold(romanMap, amount);
        String lowInRoman = romanMap.get(low);

        String roman = "";
        if (amount < 4) {
            return roman.concat(concat_n_times(amount));
        }
        else {
            int difference = Math.abs(amount - low);

            if(difference <= 3)
                roman = concat_n_times(difference);
            else
                roman = Convert(difference);

            if(amount < low)
                return roman.concat(lowInRoman);
            else
                return lowInRoman.concat(roman);
        }
    }
}