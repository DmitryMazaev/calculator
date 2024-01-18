package actions;

public class CalcSum
{
    private double a;
    private double b;
    /**
     *
     * @param a - число 1
     * @param b - число 2
     * @return Сумма чисел 1 и 2
     */
    public double calculateSum (double a, double b)
    {
        double c = a + b;
        System.out.printf("%f + %f = %f", a, b, c);
        return c;
    }
}