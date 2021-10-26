package test;

import main.Leap;
import main.Roman;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;

import static org.testng.Assert.*;

@Test
public class RomanTest {
    private Roman roman;
    private LinkedHashMap<Integer, String> romanMap;

    @BeforeMethod
    public void setUp() {
        roman = new Roman();

        romanMap = new LinkedHashMap<>();
        romanMap.put(1, "I");
        romanMap.put(2, "II");
        romanMap.put(3, "III");
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
    }
    public void num1(){
        assertEquals(roman.Convert(1), "I");
    }
    public void num2(){
        assertEquals(roman.Convert(2), "II");
    }
    public void num3(){
        assertEquals(roman.Convert(3), "III");
    }
    public void num4(){
        assertEquals(roman.Convert(4), "IV");
    }
    public void num5(){
        assertEquals(roman.Convert(5), "V");
    }
    public void num6(){
        assertEquals(roman.Convert(6), "VI");
    }
    public void num7(){
        assertEquals(roman.Convert(7), "VII");
    }
    public void num8(){
        assertEquals(roman.Convert(8), "VIII");
    }
    public void num9(){
        assertEquals(roman.Convert(9), "IX");
    }
    public void num10(){
        assertEquals(roman.Convert(10), "X");
    }
    public void num11(){
        assertEquals(roman.Convert(11), "XI");
    }
    public void num12(){
        assertEquals(roman.Convert(12), "XII");
    }
    public void num13(){
        assertEquals(roman.Convert(13), "XIII");
    }
    public void num14(){
        assertEquals(roman.Convert(14), "XIV");
    }
    public void num15(){
        assertEquals(roman.Convert(15), "XV");
    }
    public void num16(){
        assertEquals(roman.Convert(16), "XVI");
    }
    public void num17(){
        assertEquals(roman.Convert(17), "XVII");
    }
    public void num18(){
        assertEquals(roman.Convert(18), "XVIII");
    }
    public void num19(){
        assertEquals(roman.Convert(19), "XIX");
    }
    public void num20(){
        assertEquals(roman.Convert(20), "XX");
    }
    public void num21(){
        assertEquals(roman.Convert(21), "XXI");
    }
    public void num22(){
        assertEquals(roman.Convert(22), "XXII");
    }
    public void num23(){
        assertEquals(roman.Convert(23), "XXIII");
    }
    public void num24(){
        assertEquals(roman.Convert(24), "XXIV");
    }
    public void num25(){
        assertEquals(roman.Convert(25), "XXV");
    }
    public void num26(){
        assertEquals(roman.Convert(26), "XXVI");
    }
    public void num27(){
        assertEquals(roman.Convert(27), "XXVII");
    }
    public void num28(){
        assertEquals(roman.Convert(28), "XXVIII");
    }
    public void num29(){
        assertEquals(roman.Convert(29), "XXIX");
    }
    public void num30(){
        assertEquals(roman.Convert(30), "XXX");
    }
    public void num31(){
        assertEquals(roman.Convert(31), "XXXI");
    }
    public void num32(){
        assertEquals(roman.Convert(32), "XXXII");
    }
    public void num33(){
        assertEquals(roman.Convert(33), "XXXIII");
    }
    public void num34(){
        assertEquals(roman.Convert(34), "XXXIV");
    }
    public void num35(){
        assertEquals(roman.Convert(35), "XXXV");
    }
    public void num36(){
        assertEquals(roman.Convert(36), "XXXVI");
    }
    public void num37(){
        assertEquals(roman.Convert(37), "XXXVII");
    }
    public void num38(){
        assertEquals(roman.Convert(38), "XXXVIII");
    }
    public void num39(){
        assertEquals(roman.Convert(39), "XXXIX");
    }
    public void num40(){
        assertEquals(roman.Convert(40), "XL");
    }
    public void num41(){
        assertEquals(roman.Convert(41), "XLI");
    }
    public void num42(){
        assertEquals(roman.Convert(42), "XLII");
    }
    public void num43(){
        assertEquals(roman.Convert(43), "XLIII");
    }
    public void num44(){
        assertEquals(roman.Convert(44), "XLIV");
    }
    public void num45(){
        assertEquals(roman.Convert(45), "XLV");
    }
    public void num46(){
        assertEquals(roman.Convert(46), "XLVI");
    }
    public void num47(){
        assertEquals(roman.Convert(47), "XLVII");
    }
    public void num48(){
        assertEquals(roman.Convert(48), "XLVIII");
    }
    public void num49(){
        assertEquals(roman.Convert(49), "XLIX");
    }
    public void num50(){
        assertEquals(roman.Convert(50), "L");
    }
    public void num51(){
        assertEquals(roman.Convert(51), "LI");
    }
    public void num52(){
        assertEquals(roman.Convert(52), "LII");
    }
    public void num53(){
        assertEquals(roman.Convert(53), "LIII");
    }
    public void num54(){
        assertEquals(roman.Convert(54), "LIV");
    }
    public void num55(){
        assertEquals(roman.Convert(55), "LV");
    }
    public void num56(){
        assertEquals(roman.Convert(56), "LVI");
    }
    public void num57(){
        assertEquals(roman.Convert(57), "LVII");
    }
    public void num58(){
        assertEquals(roman.Convert(58), "LVIII");
    }
    public void num59(){
        assertEquals(roman.Convert(59), "LIX");
    }
    public void num60(){
        assertEquals(roman.Convert(60), "LX");
    }
    public void num64(){
        assertEquals(roman.Convert(64), "LXIV");
    }
    public void num68(){
        assertEquals(roman.Convert(68), "LXVIII");
    }
    public void num70(){
        assertEquals(roman.Convert(70), "LXX");
    }
    public void num88(){
        assertEquals(roman.Convert(88), "LXXXVIII");
    }
    public void num89(){
        assertEquals(roman.Convert(89), "LXXXIX");
    }
    public void num90(){
        assertEquals(roman.Convert(90), "XC");
    }
    public void num91(){
        assertEquals(roman.Convert(91), "XCI");
    }
    public void num94(){
        assertEquals(roman.Convert(94), "XCIV");
    }
    public void num99(){
        assertEquals(roman.Convert(99), "XCIX");
    }
    public void num100(){
        assertEquals(roman.Convert(100), "C");
    }
    public void num101(){
        assertEquals(roman.Convert(101), "CI");
    }
    public void num128(){
        assertEquals(roman.Convert(128), "CXXVIII");
    }
    public void num129(){
        assertEquals(roman.Convert(129), "CXXIX");
    }
    public void num150(){
        assertEquals(roman.Convert(150), "CL");
    }
    public void num180(){
        assertEquals(roman.Convert(180), "CLXXX");
    }
    public void num190(){
        assertEquals(roman.Convert(190), "CXC");
    }
    public void num200(){
        assertEquals(roman.Convert(200), "CC");
    }
    public void num274(){
        assertEquals(roman.Convert(274), "CCLXXIV");
    }
    public void num300(){
        assertEquals(roman.Convert(300), "CCC");
    }
    public void num398(){
        assertEquals(roman.Convert(398), "CCCXCVIII");
    }
    public void num400(){
        assertEquals(roman.Convert(400), "CD");
    }
    public void num454(){
        assertEquals(roman.Convert(454), "CDLIV");
    }
    public void num483(){
        assertEquals(roman.Convert(483), "CDLXXXIII");
    }
    public void num900(){
        assertEquals(roman.Convert(900), "CM");
    }
    public void num989(){
        assertEquals(roman.Convert(989), "CMLXXXIX");
    }
    public void num999(){
        assertEquals(roman.Convert(999), "CMXCIX");
    }
    public void num1000(){
        assertEquals(roman.Convert(1000), "M");
    }

    // Low Threshold Checks
    public void lowThreshold1(){
        assertEquals(Roman.getLowThreshold(romanMap, 1), 1);
    }
    public void lowThreshold3(){
        assertEquals(Roman.getLowThreshold(romanMap, 3), 3);
    }
    public void lowThreshold5(){
        assertEquals(Roman.getLowThreshold(romanMap, 5), 5);
    }
    public void lowThreshold9(){
        assertEquals(Roman.getLowThreshold(romanMap, 9), 9);
    }
    public void lowThreshold10(){
        assertEquals(Roman.getLowThreshold(romanMap, 10), 10);
    }
    public void lowThreshold50(){
        assertEquals(Roman.getLowThreshold(romanMap, 50), 50);
    }
    public void lowThreshold100(){
        assertEquals(Roman.getLowThreshold(romanMap, 100), 100);
}
}