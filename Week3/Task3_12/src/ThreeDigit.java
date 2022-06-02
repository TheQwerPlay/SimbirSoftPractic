import java.util.ArrayList;

public class ThreeDigit
{
    ArrayList<Integer> arrayList = new ArrayList<>();

    private void arrayFilling()
    {
        int startNumber = 99;
        for (int i = 0; i < 900; i++)
        {
            startNumber++;
            if (startNumber % 10 == 0)
            {
                arrayList.add(startNumber);
            }
        }
    }
    private void endsWithZero()
    {
        for (int i = 0; i < arrayList.size(); i++)
        {
            int sumDiv = 0;
            for (int j = 1; j <= arrayList.get(i); j++)
            {
                if (arrayList.get(i) % j == 0)
                {
                    if (!(j % 2 == 0))
                    {
                        sumDiv += j;
                    }
                }
            }
            if (sumDiv % 10 == 0)
                System.out.print(arrayList.get(i) + " ");
        }
    }

    public void outputArrayNumber()
    {
        arrayFilling();
        endsWithZero();
    }
}
