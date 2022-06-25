public class Task5_13 {
    public static void main(String[] args) {
        int[] mas = new int[6];
        int[] mas1 = new int[8];

        System.out.println("Первый массив");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 90 + 1);
            System.out.print(mas[i] + " ");
        }

        System.out.println("\nВторой массив");
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 90 + 1);
            System.out.print(mas1[i] + " ");
        }
        System.out.print("\nCначала одно значение из первого, потом все значения из второго, " +
                "\nпотом второе значение из первого, потом снова все значения из второго ...");
        jaggedArray(mas, mas1);
    }

    public static void jaggedArray(int[] mas, int[] mas1) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print("\n" + mas[i] + " ");
            for (int j = 0; j < mas1.length; j++) {
                System.out.print(mas1[j] + " ");
            }
        }
    }
}
