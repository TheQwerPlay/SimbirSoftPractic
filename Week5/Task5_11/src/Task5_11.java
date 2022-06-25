public class Task5_11
{
    public static void main(String[] args)
    {
        int length = 15;

        int[] mas = new int[length];
        int[] mas1 = new int[length];

        if (similarityCheck(mas, mas1, length))
            System.out.println("Массивы идентичны друг другу");
        else
            System.out.println("Массивы не идентичны друг другу");

        for (int i = 0; i < length; i++)
        {
            mas[i] = (int) (Math.random() * 90 + 10);
            mas1[i] = (int) (Math.random() * 90 + 10);
        }

        if (similarityCheck(mas, mas1, length))
            System.out.println("Массивы идентичны друг другу");
        else
            System.out.println("Массивы не идентичны друг другу");
    }

    public static boolean similarityCheck(int[] mas, int[] mas1, int length)
    {
        boolean check = true;
        for (int i = 0; i < length; i++)
        {
            if (mas[i] != mas1[i])
            {
                check = false;
                break;
            }
        }
        return check;
    }
}