package javahw;

import java.util.ArrayList;
import java.util.HashMap;

import static javahw.ArabicToRoman.arabicToRomanConverter;

class RomanCalc extends Controller {

    public static String operation(ArrayList<String> list) throws MyException {

        HashMap<String, Integer> map = numberMap();

        list.set(0, map.get(list.get(0)).toString());
        list.set(1, map.get(list.get(1)).toString());
        Integer res = ArabicCalc.operation(list);

        return arabicToRomanConverter(res);
    }
}
