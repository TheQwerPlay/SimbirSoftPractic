public class Task5_12
{
    static int stage;
    public static void main(String[] args)
    {
        stage = 0;

        int[] mas = new int[10];
        int[] mas1 = new int[20];

        System.out.println("Первый массив");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }

        System.out.println("\nВторой массив");
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas1[i] + " ");
        }

        if (similarityCheck(mas, mas1))
            System.out.println("\nВсе значения первого массива во втором - содержатся");
        else
            System.out.println("\nВсе значения первого массива во втором - не содержатся, на " + stage + " этапе проверки");
    }

    public static boolean similarityCheck(int[] mas, int[] mas1) {
        boolean check = true;

        for (int i = 0; i < mas.length; i++) {
            stage++;
            int count = 0;

            for (int j = 0; j < mas1.length; j++) {
                if (mas[i] == mas1[j]) {
                    count++;
                }
            }

            if (count == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}