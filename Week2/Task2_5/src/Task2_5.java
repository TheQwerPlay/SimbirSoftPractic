import java.util.Scanner;

public class Task2_5
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число");
        double num = scanner.nextDouble();

        var str = num < 0 ? Math.pow(num, 2) : "Ошибка";
        System.out.println(str);

        scanner.close();
    }
}
