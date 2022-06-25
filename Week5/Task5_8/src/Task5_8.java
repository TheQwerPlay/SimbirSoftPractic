public class Task5_8 {
    public static void main(String[] args)
    {
        int[] mas = new int[15];
        arrayNumbers(mas);
    }

    public static void arrayNumbers(int[] mas)
    {
        int num = 0;

        for (int i = 0; i < mas.length; i++)
        {
            num = (int) (Math.random() * 90 + 10);
            num = arrayCheck(mas, i, num);

            mas[i] = num;
        }

        System.out.println("\nВесь массив");
        for (int i = 0; i < mas.length; i++)
            System.out.print(mas[i] + " ");
    }

    public static int arrayCheck(int[] mas, int i, int num)
    {
        for (int j = 0; j < i; j++)
        {
            if (mas[j] == num)
            {
                num = (int) (Math.random() * 90 + 10);
                return arrayCheck(mas, i, num);
            }
        }
        return num;
    }
}
