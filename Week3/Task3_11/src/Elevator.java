import java.util.Scanner;

public class Elevator
{
    private int maxPeople;
    private int maxWeight;
    private int countWeight = 0;
    private int countPeople = 0;
    private int weightEntering;
    public Elevator(int maxPeople, int maxWeight)
    {
        this.maxPeople = maxPeople;
        this.maxWeight = maxWeight;
    }
    public void generatePeople()
    {
        Scanner scanner = new Scanner(System.in);

        while (countPeople < maxPeople)
        {
            System.out.print("Вес входящего в лифт: ");
            weightEntering = scanner.nextInt();

            if (weightEntering + countWeight >= maxWeight)
                break;
            else
            {
                countPeople++;
                countWeight += weightEntering;
                System.out.println("В лифте " + countPeople + " человек." + " Их общий вес составляет " + countWeight);
            }
        }

        stopElevator();

        scanner.close();
    }

    private void stopElevator()
    {
        System.out.print("Лифт прекратил вход по причине: ");
        if (countPeople == maxPeople)
            System.out.println("переполнения людьми.");
        else
            System.out.println("превышение веса.");
    }
}
