import actions.*;
import enterCommand.EnterCommand;
import enterCommand.EnterFirstNumber;
import enterCommand.EnterSecondNumber;
import exceptions.DivisionByZeroException;
import exceptions.InvalidInputException;

/**
 * Класс калькулятор
 */
public class Calculator {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        int command = 0;
        while (true) {
            EnterFirstNumber number1 = new EnterFirstNumber();
            a = number1.enterFirstNumber();
            EnterCommand com = new EnterCommand();
            command = com.enterCommand();
            EnterSecondNumber number2 = new EnterSecondNumber();
            b = number2.enterSecondNumber();

            if (command == 1) {
                CalcSum calcSum = new CalcSum();
                calcSum.calculateSum(a, b);
            }
            if (command == 2) {
                CalcDiff calcDiff = new CalcDiff();
                calcDiff.CalcDiff(a, b);
            }
            if (command == 3) {
                CalcMult calcMult = new CalcMult();
                calcMult.calculateMult(a, b);
            }
            if (command == 4) {
                try {
                    CalcDivision calcDivision = new CalcDivision();
                    calcDivision.calculateDivision(a, b);
                } catch (DivisionByZeroException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            if (command == 5) {
                try {
                    CalcExp calcExp = new CalcExp();
                    calcExp.calculateExp(a, b);
                } catch (InvalidInputException ex) {
                    System.out.println(ex.getMessage());
                }

            }
            System.out.println();
            System.out.println("========================");
        }

    }
}
