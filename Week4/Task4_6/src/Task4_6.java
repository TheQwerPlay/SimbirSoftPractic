import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите координату X точки А: ");
        int xCoordinateA = in.nextInt();

        System.out.print("Введите координату Y точки А: ");
        int yCoordinateA = in.nextInt();

        int quartersA = getCoordinateQuarters(xCoordinateA, yCoordinateA);
        System.out.println("1, 2, 3 или 4 - зависит от четверти. -1 - если на оси");
        System.out.println("Точка А с координатами (" + xCoordinateA + ", " + yCoordinateA + "), находится в " + quartersA + " четверти");
    }

    public static int getCoordinateQuarters(int xCoordinateA, int yCoordinateA)
    {
        int x = xCoordinateA;
        int y = yCoordinateA;

        if (x > 0 && y > 0)
            return 1;
        else if (x < 0 && y > 0)
            return 2;
        else if (x < 0 && y < 0)
            return 3;
        else if (x > 0 && y < 0)
            return 4;
        else
            return -1;
    }
}
