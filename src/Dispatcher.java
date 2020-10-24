import javahw.Calculate;
import java.util.Scanner;

public class Dispatcher extends Calculate {

    public static void main(String[] args) {

        System.out.println("Введите арифметическую операцию");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println(calculate(line));

    }
}

