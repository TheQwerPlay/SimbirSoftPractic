public class Task5_7
{
    public static void main(String[] args)
    {
        int[] mas = new int[89];
        arrayNumbers(mas);
    }

    public static void arrayNumbers(int[] mas)
    {
        int num = 0;

        for (int i = 0; i < mas.length; i++)
        {
            num = randomNumber(num);
            mas[i] = num;
            if (num == 99) {
                num = i;
                break;
            }
        }

        System.out.println("\nВесь массив");
        for (int i = 0; i <= num; i++)
            System.out.print(mas[i] + " ");
    }

    public static int randomNumber(int num)
    {
        int rNum = (int) (Math.random() * 90 + 10);
        if (rNum <= num)
            return randomNumber(num);
        else
            return rNum;
    }
}
