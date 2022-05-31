import java.util.ArrayList;
import java.util.Scanner;

public class WorkWithX
{
    ArrayList<Integer> arrayList = new ArrayList<>();
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


    private void numberDivisors()
    {
        for (int i = 2; i < (x/2)+1; i++)
        {
            if (x % i == 0)
            {
                arrayList.add(i);
            }
        }
    }

    public void arrayOutput()
    {
        numberDivisors();
        System.out.println("Все делители числа " + x + ": ");
        if(arrayList.size() == 0)
        {
            System.out.print("Данное число не имеет делителей");
        }
        else
        {
            for (int divisors : arrayList)
            {
                System.out.print(divisors + " ");
            }
        }
        System.out.println("\nВсего делителей числа " + x + ": " + arrayList.size());
        System.out.println("\nГотово!");
    }
}
