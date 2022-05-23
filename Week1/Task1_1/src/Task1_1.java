public class Task1_1 {
    public static void main(String args[]) {
        //Составить программу вывода на экран в одну строку трех любых чисел с двумя пробелами между ними.
        int numA = (int) (Math.random() * 201 - 100);
        int numB = (int) (Math.random() * 201 - 100);
        int numC = (int) (Math.random() * 201 - 100);
        System.out.println(numA + "  " + numB + "  " + numC);
    }
}
