package javahw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum RomanNum {
    I(1), IV(4), V(5), IX(9), X(10), L(50), C(100), D(500), M(1000);

    private int value;

    RomanNum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanNum> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanNum e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}
