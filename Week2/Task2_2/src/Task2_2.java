import java.util.Scanner;

public class Task2_2
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        double first = getDouble();
        double second = getDouble();

        if (first == second)
            System.out.println("Числа равны");
        else if (first > second)
            System.out.println("Первое число " + first + " больше" + " второго числа " + second);
        else
            System.out.println("Первое число " + first + " меньше" + " второго числа " + second);

        scanner.close();
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
}
