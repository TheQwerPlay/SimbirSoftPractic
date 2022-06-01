import java.util.Scanner;

public class Task3_5
{
    public static void main(String[] args)
    {
        System.out.print("Введите число, отвечащее за кол-во чисел в последовательности: ");
        int X = GetX();
        int firstNum = 1;
        int secondNum = 1;
        int outNum;
        System.out.print(firstNum + " " + secondNum + " ");
        for(int i = 3; i <= X; i++)
        {
            outNum = firstNum + secondNum;
            System.out.print(outNum + " ");
            firstNum = secondNum;
            secondNum = outNum;
        }
    }

    public static int GetX()
    {
        int x;
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
}
