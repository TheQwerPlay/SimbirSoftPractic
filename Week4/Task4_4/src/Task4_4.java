import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();
        int res = evenOrOdd(num);
        System.out.println("В числе " + num + " больше четных(1), больше нечетных(-1), равенства(0)");
        System.out.println("Результат: " + res);
    }

    public static int evenOrOdd(int num)
    {
        int evenCount = 0;
        int oddCount = 0;
        int length = String.valueOf(num).length();
        for (int i = 0; i < length; i++)
        {
            int X = num % 10;
            if (X % 2 == 0)
                evenCount++;
            else
                oddCount++;
            num /= 10;
        }

        if (evenCount > oddCount)
            return 1;
        else if (evenCount < oddCount)
            return -1;
        else
            return 0;
    }
}
