package exceptions;

public class DivisionByZeroException extends Exception
{
    /**
     *
     * @param massege Сообщение об ошибке при делении на ноль
     */
    public DivisionByZeroException (String massege)
    {
        super(massege);
    }
}