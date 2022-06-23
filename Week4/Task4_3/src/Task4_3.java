import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        System.out.print("\nВведите цифру: ");
        int digit = in.nextInt();
        int count = digitInNum(num, digit);

        System.out.println("Количество цифр " + digit + " в числе " + num + " " + count);
    }

    public static int digitInNum(int num, int digit) {
        int count = 0;
        int length = String.valueOf(num).length();
        for (int i = 0; i < length; i++) {
            if (num % 10 == digit) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}
