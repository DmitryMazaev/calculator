package actions;
public class CalcDiff {
    private double a;
    private double b;

    /**
     *
     * @param a - число 1
     * @param b - число 2
     * @return Разница чисел 1 и 2
     */
    public double CalcDiff (double a, double b)
    {
        double c = a - b;
        System.out.printf("%f - %f = %f", a, b, c);
        return c;
    }
}
