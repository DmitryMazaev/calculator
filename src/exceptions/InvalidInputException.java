package exceptions;

public class InvalidInputException extends Exception
{
    /**
     *
     * @param massege Сообщение об ошибке при вводе некорретного значения
     */
    public InvalidInputException (String massege)
    {
        super(massege);
    }
}