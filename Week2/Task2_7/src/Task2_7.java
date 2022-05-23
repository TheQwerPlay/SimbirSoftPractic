import java.util.Scanner;

public class Task2_7
{

    public static void main(String[] args)
    {
        GetInt getInt = new GetInt();

        int number = getInt.threeDigitPositive();
        System.out.println("Исходное число " + number);

        System.out.print("Ваш результат: ");
        getInt.getNumberChange();
    }
}
