public class Task5_10 {
    public static void main(String[] args) {
        int[] mas = new int[15];
        int X = 42;
        System.out.println("Массив");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 9 + 1);
            System.out.print(mas[i] + " ");
        }

        System.out.println("\nСнизу вывод двух чисел и их порядковые номера, если их произведение равно " + X);
        searchTwoNum(mas, X);
    }

    public static void searchTwoNum(int[] mas, int X) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length; j++) {
                if (mas[i] * mas[j] == X) {
                    System.out.println((i + 1) + ": " + mas[i] + " и " + (j + 1) + ": " + mas[j]);
                }
            }
        }
    }
}
