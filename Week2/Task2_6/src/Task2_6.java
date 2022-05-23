import java.util.Scanner;

public class Task2_6
{

    public static void main(String[] args)
    {
        int num = getInt();
        int tens = num / 10;
        int units = num % 10;

        if (tens > units)
            System.out.println(tens + " > " + units);
        else if (tens < units)
            System.out.println(tens + " < " + units);
    }

    public static int getInt()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Введите двузначное положительное число:");
        if(sc.hasNextInt())
        {
            num = sc.nextInt();
            if (!(num > 9 && num < 100))
            {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                num = getInt();
            }
        }
        else
        {
            System.out.println("Вы ввели не целое число");
            num = getInt();
        }

        sc.close();
        return num;
    }
}

