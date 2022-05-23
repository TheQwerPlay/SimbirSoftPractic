import java.util.Scanner;

public class Task2_1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        double avg = scanner.nextDouble();
        if (avg == 100)
            System.out.println("Молодец");

        System.out.println("Введите число");
        double mark = scanner.nextDouble();
        if (mark < 60)
            mark += mark * 0.1;
        System.out.println("Число = " + mark);

        System.out.println("Введите первое число");
        double one = scanner.nextDouble();

        System.out.println("Введите второе число");
        double two = scanner.nextDouble();

        if (one > two)
            System.out.println("Значение one: " + one);
        else if (one < two)
            System.out.println("Значение two: " + two);

        System.out.println("Введите число");
        double num = scanner.nextDouble();

        if (num > 0)
            System.out.println("Число " + num + " положительное");
        else if (num < 0)
            System.out.println("Число " + num + " отрицательное");

        System.out.println("Введите первый угол");
        double ugol1 = scanner.nextDouble();

        System.out.println("Введите второй угол");
        double ugol2 = scanner.nextDouble();

        System.out.println("Введите третий угол");
        double ugol3 = scanner.nextDouble();
        if ((ugol1 + ugol2 + ugol3) == 180)
            System.out.println("Это углы одного треугольника");
        else
            System.out.println("Это не углы одного треугольника");
        scanner.close();
    }
}