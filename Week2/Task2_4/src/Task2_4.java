import java.util.Scanner;

public class Task2_4
{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        double[] nums = new double[2];

        for (int i = 0; i < nums.length; i++)
        {
            nums[i] = getDouble();
        }
        int lenMas = nums.length;

        masSort sort = new masSort(nums, lenMas);

        sort.minToMax();
        sort.maxToMin();

        scanner.close();
    }

    public static double getDouble()
    {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextDouble())
        {
            num = scanner.nextDouble();
        }
        else
        {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getDouble();
        }
        return num;
    }
}