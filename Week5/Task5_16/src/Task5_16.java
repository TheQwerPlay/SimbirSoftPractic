public class Task5_16 {
    public static void main(String[] args) {
        int[] mas = new int[20];
        int j = 1;
        for (int i = 0; i < mas.length; i += 2) {
            mas[i] = (int) (Math.random() * 9 + 1);
            mas[i + 1] = (int) (Math.random() * 9 + 1);
            System.out.println((j++) + " точка с координатами (" + mas[i] + ";" + mas[i + 1] + ")");
        }
        int radiusR = 5;
        System.out.println("Радиус окружности R = " + radiusR);
        System.out.println("Точки лежащие на окружности:");
        pointOnCircle(mas, radiusR);
    }

    public static void pointOnCircle(int[] mas, int radiusR) {
        double x, y;
        for (int i = 0; i < mas.length; i += 2) {
            x = mas[i];
            y = mas[i + 1];
            if ((x * x + y * y) == radiusR * radiusR) {
                System.out.println((i / 2 + 1) + " точка с координатами (" + mas[i] + ";" + mas[i + 1] + ")");
            }
        }
    }
}
