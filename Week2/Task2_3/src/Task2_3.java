import java.util.Scanner;

public class Task2_3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        double num = scanner.nextDouble();

        num = num < 0 ? -num : 0;
        System.out.println("Число стало = " + num);

        scanner.close();
    }
}
