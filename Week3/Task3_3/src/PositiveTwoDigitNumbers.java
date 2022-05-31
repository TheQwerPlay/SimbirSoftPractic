import java.util.ArrayList;

public class PositiveTwoDigitNumbers
{
    ArrayList<Integer> arrayList = new ArrayList<>();

    private void arrayFilling()
    {
        for (int i = 10; i < 100; i++)
        {
            int tens = i / 10;
            int units = i % 10;
            if (tens * units >= 10 && tens * units < 100)
            {
                arrayList.add(i);
            }
        }
    }

    public void arrayOutput()
    {
        arrayFilling();
        System.out.println("Все положительные двузначные числа в возрастающем порядке\n произведение цифр которых является тоже двузначным числом:");

        for (int num : arrayList)
        {
            System.out.print(num + " ");
        }

        System.out.println("\nГотово!");
    }

}
