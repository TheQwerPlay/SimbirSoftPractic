import java.util.Scanner;

public class Task5_6
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число S: ");
        int S = in.nextInt();

        int [] mas = new int[11];
        arrayNumbers(mas, S);
    }

    public static void arrayNumbers(int[] mas, int S)
    {
        System.out.println("Чётные ячейки массива по индексу:");
        for (int i = 0; i < mas.length; i++)
        {
            if (i % 2 == 0)
                mas[i] = (int) (Math.random() * 90 + 10);
            else
                mas[i] = 0;
            System.out.print(mas[i] + " ");
        }

        System.out.println("\nВесь массив");

        for (int i = 0; i < mas.length; i++)
        {
            if (i % 2 != 0)
                mas[i] = S - mas[i-1];
            System.out.print(mas[i] + " ");
        }
    }
}
