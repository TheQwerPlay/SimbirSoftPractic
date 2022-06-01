public class ThreeDigitPositive
{
    private int[] arrayOfNumbers = new int[24];

    private void arrayFilling()
    {
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            arrayOfNumbers[i] = (int) (Math.random() * 900 + 100);
        }
    }

    public void getIndexMaxNumber()
    {
        arrayFilling();

        int maxNumber = arrayOfNumbers[0];

        int index = 0;

        for (int i = 1; i < arrayOfNumbers.length; i++)
        {
            if (arrayOfNumbers[i] > maxNumber)
            {
                index = i;
                maxNumber = arrayOfNumbers[i];
            }
        }
        System.out.println("Самое большое число: " + arrayOfNumbers[index] + ".\n" +
                "Под номером: " + (++index) + ".");

    }
    public void outArray()
    {
        for (int i = 0; i < arrayOfNumbers.length; i++)
        {
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}
