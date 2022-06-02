import java.util.Scanner;

public class getNumber
{
    static int x;
    int count = 0;

    public static int GetX()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        if (sc.hasNextInt()) {
            x = sc.nextInt();
            if (x <= 0) {
                System.out.println("Вы ввели отрицательное число, повторите попытку");
                x = GetX();
            }
        } else {
            System.out.println("Вы ввели не целое число, повторите попытку");
            x = GetX();
        }
        sc.close();
        return x;
    }

    public void checkIsItANaturalNumber()
    {
        for (int i = 1; i < x / 2 + 1; i++)
        {
            if (x % i == 0)
            {
                count = 0;
                for (int j = 1; j < i / 2 + 1; j++)
                    if (i % j == 0)
                        count++;
                if (count == 1)
                    System.out.print(i + " ");

            }
        }
    }

}
