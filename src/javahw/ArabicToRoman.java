package javahw;

import java.util.List;

public class ArabicToRoman {
    public static String arabicToRomanConverter(Integer arabic) {

        StringBuilder result = new StringBuilder();
        if (arabic<0) {
            arabic= Math.abs(arabic);
            result.append("-");
        }

        List<RomanNum> romanNumerals = RomanNum.getReverseSortedValues();

        int i = 0;

        while (arabic > 0)  {

            RomanNum symbol = romanNumerals.get(i);

            if (symbol.getValue()<=arabic) {
                result.append(symbol);
                arabic=arabic-symbol.getValue();
            } else {
                i++;
            }
        }

        return result.toString();
    }
}
