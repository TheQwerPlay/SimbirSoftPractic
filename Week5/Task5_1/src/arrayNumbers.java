import java.util.Random;

public class arrayNumbers {
    static int[] mas;
    static int lengthMas;

    public arrayNumbers(int[] mas, int lengthMas) {
        this.lengthMas = lengthMas;
        this.mas = mas;
    }

    public void filling() {
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 900 + 100);
            System.out.print(mas[i] + " ");
        }
    }

    public void output()
    {
        if (lengthMas % 2 != 0)
        {
            System.out.println("\nМассив имеет нечетный размер, центральная ячейка в первой строке");
            System.out.println("!!Первая половина массива");
            for (int i = 0; i < lengthMas / 2 + 1; i++)
            {
                System.out.print(mas[i] + " ");
            }
            System.out.println("\n!!Вторая половина массива");
            for (int i = lengthMas / 2 + 1; i < lengthMas; i++)
            {
                System.out.print(mas[i] + " ");
            }
        }
        else
        {
            System.out.println("\nМассив имеет четный размер");
            System.out.println("!!Первая половина массива");
            for (int i = 0; i < lengthMas / 2; i++)
            {
                System.out.print(mas[i] + " ");
            }
            System.out.println("\n!!Вторая половина массива");
            for (int i = lengthMas / 2; i < lengthMas; i++)
            {
                System.out.print(mas[i] + " ");
            }
        }
    }
}
