import java.util.Scanner;

public class Task1_2
{
    public static void main(String[] args)
    {
        /*Составить программу вывода на экран числа, вводимого с клавиатуры.
        Выводимому числу должно предшествовать сообщение «Вы ввели число».*/

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        String str = in.nextLine();

        double numA = Double.parseDouble(str.replace(",", "."));

        System.out.println("Вы ввели число");
        System.out.println(numA);

        in.close();
    }
}
