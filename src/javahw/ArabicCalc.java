package javahw;

import java.util.ArrayList;

class ArabicCalc {
    public static Integer operation(ArrayList<String> list) throws MyException {
        if ("+".equals(list.get(2))) {
            return Integer.parseInt(list.get(0)) + Integer.parseInt(list.get(1));
        }
        if ("-".equals(list.get(2))) {
            return Integer.parseInt(list.get(0)) - Integer.parseInt(list.get(1));
        }
        if ("*".equals(list.get(2))) {
            return Integer.parseInt(list.get(0)) * Integer.parseInt(list.get(1));
        }
        if ("/".equals(list.get(2))) {
            return Integer.parseInt(list.get(0)) / Integer.parseInt(list.get(1));
        } else
            throw new MyException("Знак не принадлежит к разрешенным арифметическим операциям");
    }
}
