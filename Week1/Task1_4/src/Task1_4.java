import java.util.Scanner;

public class Task1_4
{
    public static void main(String[] args)
    {
        /* Составить программу, где пользователь будет вводить с клавиатуры 2 числа. Числа будут сравниваться между собой.
        Результат сравнения выводится на экран в виде: “числа равны”, “первое число больше второго”, “первое число меньше второго”*/

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число");
        String str = in.nextLine();

        double numA = Double.parseDouble(str.replace(",", "."));

        System.out.println("Введите второе число");
        str = in.nextLine();

        double numB = Double.parseDouble(str.replace(",", "."));

        if (numA > numB) {
            System.out.println("первое число больше второго");
        } else if (numA < numB) {
            System.out.println("первое число меньше второго");
        } else System.out.println("числа равны");

        in.close();
    }
}