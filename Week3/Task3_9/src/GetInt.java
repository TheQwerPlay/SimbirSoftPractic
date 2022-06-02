import java.util.ArrayList;
import java.util.Scanner;

public class GetInt
{
    private ArrayList<Integer> arrayList = new ArrayList<>();
    public int inputInt()
    {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Введите целое число:");
        if(sc.hasNextInt())
        {
            num = sc.nextInt();
        }
        else
        {
            System.out.println("Вы ввели не целое число");
            num = inputInt();
        }
        sc.close();
        return num;
    }
    public void arrayFilling()
    {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int nextNumber = 1;
        while (count < 5)
        {
            System.out.print("Введите " + nextNumber + "-ое число: ");
            int number = sc.nextInt();
            arrayList.add(number);
            if ((number % 2 == 0) && !(nextNumber % 2 == 0))
            {
                count++;
            }
            nextNumber++;
        }
        sc.close();
    }
    public void arrayOutput()
    {
        for (int i : arrayList)
        {
            System.out.print(i + " ");
        }
    }
}