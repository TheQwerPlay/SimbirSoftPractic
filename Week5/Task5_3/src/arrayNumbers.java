public class arrayNumbers
{
    static int[] mas;
    static int lengthMas;

    public arrayNumbers(int[] mas, int lengthMas)
    {
        this.lengthMas = lengthMas;
        this.mas = mas;
    }

    public void filling() {
        for (int i = 0; i < mas.length; i++)
        {
            mas[i] = (int) (Math.random() * 90 + 10);
            System.out.print(mas[i] + " ");
        }
    }

    public void output()
    {
        System.out.println("\n!!Четные значения массива");

        for (int i = 1; i < lengthMas; i ++)
            if (mas[i] % 2 == 0)
                System.out.print(mas[i] + " ");

        System.out.println("\n!!Нечетные значения массива");

        for (int i = 0; i < lengthMas; i ++)
            if (mas[i] % 2 != 0)
                System.out.print(mas[i] + " ");

    }
}