package enterCommand;

import java.util.Scanner;

public class EnterFirstNumber {
    /**
     *
     * @return Ввод первого числа
     */
    public double enterFirstNumber()
    {
        double a = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число: ");
            String input = in.next();
            a = 0;
            try {
                a = Double.parseDouble(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное число.");
                System.out.println("Пожалуйста, введите число с плавающей точкой (double).");
            }

        }
        return a;
    }
}
