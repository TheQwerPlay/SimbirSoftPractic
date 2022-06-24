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

    public void output() {
        System.out.println();

        for (int i = 0; i < lengthMas / 2; i++)
            System.out.println((i + 1) + ": " + mas[i] + " и " + (lengthMas - i) + ": " + mas[lengthMas - 1 - i]);

        if (lengthMas % 2 != 0)
            System.out.println("\t" + (lengthMas / 2 + 1) + ": " + mas[lengthMas / 2]);
    }
}