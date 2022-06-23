import java.util.Scanner;

public class Task4_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите координату X центра окружности O: ");
        int xCoordinateO = in.nextInt();

        System.out.print("Введите координату Y центра окружности O: ");
        int yCoordinateO = in.nextInt();

        System.out.print("Введите радиус круга O: ");
        int circleRadius = in.nextInt();

        System.out.print("Введите координату X некой точки А: ");
        int aCoordinateA = in.nextInt();

        System.out.print("Введите координату Y некой точки А: ");
        int bCoordinateA = in.nextInt();

        ////(a, b) – координаты точки А
        ////(x, y) – координаты центра круга и r – его радиус
        //// А лежит внутри круга (включая границы), если (x – a)2 + (y – b)2 ≤ r2

        pointAndCircle(xCoordinateO, yCoordinateO, circleRadius, aCoordinateA, bCoordinateA);
    }

    public static void pointAndCircle(int xCoordinateO, int yCoordinateO, int circleRadius, int aCoordinateA, int bCoordinateA)
    {
        double firstСalc = Math.pow(xCoordinateO - aCoordinateA, 2);
        double secondCalc = Math.pow(yCoordinateO - bCoordinateA, 2);

        if (firstСalc + secondCalc <= Math.pow(circleRadius,2))
        {
            System.out.println("Точка А лежит внутри окружности (включая границы)");
        }
        else System.out.println("Точка А за пределами границ окружности");
    }
}
