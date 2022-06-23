import java.util.Scanner;

public class Task4_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        String str = in.nextLine();

        double x = Double.parseDouble(str.replace(",", "."));
        metod(x);
    }

    public static void metod(double x)
    {
        if (x > 0)
            System.out.println(1);
        else if (x == 0)
            System.out.println(0);
        else
            System.out.println(-1);
    }
}
