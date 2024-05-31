import java.io.IOException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String example = scanner.nextLine();
            String[] numbers = example.split(" ");
            if ((Integer.parseInt(numbers[0]) > 0 && Integer.parseInt(numbers[0]) < 10) && (Integer.parseInt(numbers[2]) > 0 && Integer.parseInt(numbers[2]) < 10)) {
                switch (numbers[1]) {
                    case "+" -> System.out.println(Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[2]));
                    case "-" -> System.out.println(Integer.parseInt(numbers[0]) - Integer.parseInt(numbers[2]));
                    case "*" -> System.out.println(Integer.parseInt(numbers[0]) * Integer.parseInt(numbers[2]));
                    case "/" -> System.out.println(Integer.parseInt(numbers[0]) / Integer.parseInt(numbers[2]));
                    default -> throw new Exception("Неверный формат знака");
                }
            } else {
                throw new Exception("Неверный формат числа");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}