import java.util.Scanner;

public class SeriesOfPositiveNumbers
{
    static int x;
    public static int GetX()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное число:");
        if (sc.hasNextInt())
        {
            x = sc.nextInt();
            if (x<=0)
            {
                System.out.println("Вы ввели отрицательное число, повторите попытку");
                x = GetX();
            }
        }
        else
        {
            System.out.println("Вы ввели не целое число, повторите попытку");
            x = GetX();
        }
        sc.close();
        return x;
    }

    public void outputLine()
    {
        System.out.println("Вывод в строку серии из 17 целых положительных чисел");
        System.out.print(x + " ");
        int num = x + 1;
        for (int i = 1; i<2; i++)
        {
            System.out.print(num + " ");
            for (int j = 2; j <= 17; j++)
            {
                num+=3;
                System.out.print(num + " ");
            }
        }
        System.out.println("\nГотово!");
    }
}
