package actions;
import exceptions.DivisionByZeroException;

public class CalcDivision
{
    private double a;
    private double b;
    /**
     *
     * @param a - число 1
     * @param b - число 2
     * @return Частное чисел 1 и 2
     */
    public double calculateDivision (double a, double b) throws DivisionByZeroException
    {
        if (b ==0)
        {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        double c = a / b;
        System.out.printf("%f / %f = %f", a, b, c);
        return c;
    }

}