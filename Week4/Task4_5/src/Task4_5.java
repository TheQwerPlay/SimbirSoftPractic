import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите координату X точки А: ");
        int xCoordinateA = in.nextInt();

        System.out.print("Введите координату Y точки А: ");
        int yCoordinateA = in.nextInt();

        System.out.print("Введите координату X точки B: ");
        int xCoordinateB = in.nextInt();

        System.out.print("Введите координату Y точки B: ");
        int yCoordinateB = in.nextInt();
        double segmentAB = lengthAB(xCoordinateA, yCoordinateA, xCoordinateB, yCoordinateB);
        System.out.println("Длина отрезка AB = " + segmentAB);

    }

    public static double lengthAB(int xCoordinateA, int yCoordinateA, int xCoordinateB, int yCoordinateB)
    {
        double firstСalc = Math.pow(yCoordinateB - yCoordinateA, 2);
        double secondCalc = Math.pow(xCoordinateB - xCoordinateA, 2);

        double length = Math.sqrt(firstСalc + secondCalc);

        return length;
    }
}
