import java.util.ArrayList;

public class Task5_15 {
    static ArrayList<Integer> arrayListUnique = new ArrayList<>();

    public static void main(String[] args) {
        int[] mas = new int[8];
        int[] mas1 = new int[11];

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

        System.out.println("\nМассив уникальных чисел, которые есть только в первом массиве, а во втором их нет:");

        uniqueNumbers(mas, mas1);

        for (Integer s : arrayListUnique) {
            System.out.print(s + " ");
        }
    }

    public static void uniqueNumbers(int[] mas, int[] mas1) {
        for (int i = 0; i < mas.length; i++) {
            int count = 0;

            for (int j = 0; j < mas1.length; j++) {
                if (mas[i] == mas1[j]) {
                    count++;
                }
            }
            if (count == 0) {
                arrayListUnique.add(mas[i]);
            }
        }
    }
}
