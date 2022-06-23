import java.util.Scanner;

public class Task4_2
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int N = in.nextInt();
        System.out.println("Общее количество делителей для всех чисел из диапазона от "
                + N + " до " + (2 * N) + ": " + N_2N(N));
    }

    public static int N_2N(int N)
    {
        int divisor = 0;
        for (int i = N; i <= N * 2; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0) {
                    divisor++;
                }
            }
        }
        return divisor;
    }
}
