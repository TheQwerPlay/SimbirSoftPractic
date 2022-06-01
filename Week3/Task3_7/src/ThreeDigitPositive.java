public class ThreeDigitPositive
{
    private int[] arrayOfNumbers = new int[25];

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
        int hundredths = arrayOfNumbers[0] / 100;
        int tens = arrayOfNumbers[0] / 10 % 10;
        int units = arrayOfNumbers[0] % 10;

        int maxNumber = hundredths + tens + units;

        int index = 0;

        for (int i = 1; i < arrayOfNumbers.length; i++)
        {
            hundredths = arrayOfNumbers[i] / 100;
            tens = arrayOfNumbers[i] / 10 % 10;
            units = arrayOfNumbers[i] % 10;

            int secondNumber = hundredths + tens + units;

            if (secondNumber > maxNumber)
            {
                index = i;
                maxNumber = secondNumber;
            }
        }
        System.out.println("Число, сумма цифр которого была максимальной: " + arrayOfNumbers[index] + ".\n" +
                "Оно под номером: " + (++index) + ".");

    }
}