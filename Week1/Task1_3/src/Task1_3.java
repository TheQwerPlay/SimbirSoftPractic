import java.util.Scanner;

public class Task1_3
{
    public static void main(String[] args)
    {
        /*Составить программу в которой пользователь поэтапно вводит длину и ширину прямоугольника,
        а программа выводит на экран его периметр и длину диагонали.
        Каждому значению должно предшествовать соответствующие сообщения
        (“Периметр прямоугольника равен:”,”Длина диагонали равна:”)
        */

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину прямоугольника");
        int lengthR = sc.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int widthR = sc.nextInt();

        int perimeter = 2 * (lengthR + widthR);
        System.out.println("Периметр прямоугольника равен: " + perimeter);

        double s = Math.sqrt(lengthR * lengthR + widthR * widthR);
        System.out.printf("Длина диагонали равна: %.2f \n", s);

        sc.close();
    }
}
