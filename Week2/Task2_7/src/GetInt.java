import java.util.Scanner;

public class GetInt
{
    static int number;
    static String numberStr;
    static char[] strToArray;
    public static int threeDigitPositive()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное положительное число:");
        if (sc.hasNextInt())
        {
            number = sc.nextInt();
            if (!(number > 99 && number < 1000))
            {
                System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
                number = threeDigitPositive();
            }
        }
        else
        {
            System.out.println("Вы ввели не целое число");
            number = threeDigitPositive();
        }

        sc.close();
        return number;
    }

    private static void numberToChar(int number)
    {
        numberStr = Integer.toString(number);
        strToArray = numberStr.toCharArray();
    }
    public static void getNumberChange()
    {
        changeNumber();
        for (int i = 0; i < strToArray.length; i++)
        {
            System.out.print(strToArray[i]);
        }
    }
    private static void changeNumber()
    {
        numberToChar(number);
        if (number > 500)
            moreFiveHundred();
        else
            lowerFiveHundred();
    }

    private static void moreFiveHundred()
    {
        char temp = strToArray[0];
        strToArray[0] = strToArray[2];
        strToArray[2] = temp;
    }
    private static void lowerFiveHundred()
    {
        char temp = strToArray[1];
        strToArray[1] = strToArray[2];
        strToArray[2] = temp;
    }
}
