import java.util.*;

public class PositiveTwoDigitEvenNumbers
{
    ArrayList<Integer> arrayList = new ArrayList<>();

    private void arrayFilling()
    {
        for (int i = 10; i < 100; i++)
        {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }
    }

    public void arrayOutput()
    {
        arrayFilling();
        System.out.println("Все положительные двузначные четные числа (в возрастающем порядке)");

        for (int num : arrayList)
        {
            System.out.print(num + " ");
        }

        System.out.println("\nГотово!");
    }

}
