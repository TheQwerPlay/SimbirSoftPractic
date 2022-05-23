import java.util.Scanner;

public class Task1_5
{
    static Scanner scanner = new Scanner(System.in);
    static double second;
    static String operation;

    public static void main(String[] args)
    {
        /*Составить программу в которой пользователь поэтапно вводит два числа и один из символов: +, -, *, /
        Программа считает в соответствии с выбранным символом их сумму, разность,
        произведение или частное от деления первого числа на второе.
        Выводимому результату должно предшествовать соответствующее сообщение.
        Стоит учитывать правило “деления на 0”, и в случае попытки деления на 0,
        вывести на экран соответствующее сообщение.*/

        double first = getDouble();
        second = getDouble();

        operation = getOperation();

        divisionByZero();

        double result = calc(first, second, operation);

        System.out.printf("Результат операции: %.2f", result);

    }

    public static double getDouble()
    {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextDouble())
        {
            num = scanner.nextDouble();
        }
        else
        {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }

    public static String getOperation()
    {
        System.out.println("Введите, что Вы хотите сделать с числами (+, -, *, /): ");
        String operation = scanner.next();
        if (operation.contains("+") || operation.contains("-") ||
                operation.contains("*") || operation.contains("/"))
        {
            return operation;
        }
        else
        {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            return getOperation();
        }
    }

    public static void divisionByZero()
    {
        if ((second == 0) && (operation.equals("/")))
        {
            System.out.println("Вы патаетесь поделить на ноль. Попробуйте еще раз");
            second = getDouble();
            operation = getOperation();
            divisionByZero();
        }
    }

    public static double calc(double first, double second, String operation)
    {
        double _result = 0;
        switch (operation)
        {
            case "+":
                _result = first + second;
                break;
            case "-":
                _result = first - second;
                break;
            case "*":
                _result = first * second;
                break;
            case "/":
                _result = first / second;
                break;
            default:
        }
        return _result;
    }
}