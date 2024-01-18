package enterCommand;

import java.util.Scanner;

public class EnterCommand {
    /**
     *
     * @return Выбор действия для вычисления
     */
    public int enterCommand()
    {
        int com = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Выберите действие: 1 - сложение, 2 - вычитание, 3 - умножение, 4 - деление, 5 - возведение в степень: ");
            String input = in.next();
            
            if (input.equals("1") || input.equals("2") || input.equals("3") || input.equals("4") || input.equals("5"))
                try {
                    com = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: выбрано некорректное действие.");
                    
                }
            else
            {
                System.out.println("Пожалуйста, введите число от 1 до 5.");
            }
        }
        return com;
    }
}
