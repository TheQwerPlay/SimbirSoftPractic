public class SearchMax
{
    private int[] arrayOfNumbers = new int[25];
    public void arrayFilling()
    {
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            arrayOfNumbers[i] = (int) (Math.random() * 90 + 10);
        }
    }
    public void calculationMax()
    {
        int firstMaxNum = 10;
        int secondMaxNum;

        int firstDivisor = 0;
        var secondDivisor = 1;

        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            int tens = arrayOfNumbers[i] / 10;
            int units = arrayOfNumbers[i] % 10;

            secondDivisor = tens * units;

            if (secondDivisor == 0)
                continue;

            if (arrayOfNumbers[i] % secondDivisor == 0)
            {
                secondMaxNum = arrayOfNumbers[i];
                if (secondMaxNum > firstMaxNum)
                {
                    firstMaxNum = secondMaxNum;
                    firstDivisor = secondDivisor;
                }
            }
        }
        System.out.print("Наибольшее положительное двузначное число, которое делится на произведение своих цифр: ");
        if (firstMaxNum == 10)
        {
            System.out.println(" отсутствует");
        }
        else
        {
            System.out.println(firstMaxNum);
        }
        System.out.println("При этом делитель равен: " + firstDivisor);
    }

    public void outArray()
    {
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}
