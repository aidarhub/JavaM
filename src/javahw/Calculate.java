package javahw;

import java.util.ArrayList;

public class Calculate extends Controller{
    public static String calculate(String s){
        try {
            ArrayList<String> list = ParseString.parse(s);

            if (check(list).get(3).equals("roman")) {
                return RomanCalc.operation(list);
            } else {
                if (check(list).get(3).equals("arabic")) {
                    return ArabicCalc.operation(list).toString();
                }
            }
        } catch (MyException exception) {
            exception.printStackTrace();
        }
        return null;
    }
}

