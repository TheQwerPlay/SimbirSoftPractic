public class Task3_11
{
    public static void main(String[] args)
    {
        int maxPeople = 6;
        int maxWeight = 450;

        System.out.println("Лифт открывается");
        System.out.println("«Не более 6 человек или не более 450 кг»");

        Elevator elevator = new Elevator(maxPeople, maxWeight);
        elevator.generatePeople();

    }
}
