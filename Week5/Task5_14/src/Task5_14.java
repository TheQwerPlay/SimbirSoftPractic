public class Task5_14 {
    public static void main(String[] args) {

        int[] masA = new int[11];

        System.out.println("Первый массив");
        for (int i = 0; i < masA.length; i++) {
            masA[i] = (int) (Math.random() * 9 + 1);
            System.out.print(masA[i] + " ");
        }

        int halfLength = masA.length / 2;
        int[] masB = new int[halfLength];

        masB = arrayAtoB(masA, masB);

        System.out.println("\nВторой массив состоящий из элементов стоящих на чётных местах");
        for (int i = 0; i < masB.length; i++)
            System.out.print(masB[i] + " ");
    }

    public static int[] arrayAtoB(int[] masA, int[] masB) {
        int j = 0;
        for (int i = 0; i < masA.length; i++) {
            if ((i + 1) % 2 == 0) {
                masB[j] = masA[i];
                j++;
            }
        }
        return masB;
    }
}
