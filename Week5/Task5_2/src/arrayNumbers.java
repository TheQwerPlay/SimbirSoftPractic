import java.util.Random;

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
        System.out.println("\n!!Чётные ячейки массива");

        for (int i = 1; i < lengthMas; i += 2)
            System.out.print(mas[i] + " ");

        System.out.println("\n!!Нечётные ячейки массива");

        for (int i = 0; i < lengthMas; i += 2)
            System.out.print(mas[i] + " ");

    }
}