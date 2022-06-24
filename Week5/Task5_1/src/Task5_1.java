import java.util.Scanner;

public class Task5_1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите длину массива: ");
        int lengthMas = in.nextInt();

        int [] mas = new int[lengthMas];

        arrayNumbers arrayNumbers = new arrayNumbers(mas, lengthMas);
        System.out.println("Исходный заполненный массив");
        arrayNumbers.filling();
        arrayNumbers.output();
    }
}
