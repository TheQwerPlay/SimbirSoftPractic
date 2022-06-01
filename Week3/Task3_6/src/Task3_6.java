public class Task3_6
{
    public static void main(String[] args)
    {
        int[] arrayDiameter = new int[120];
        int[] arrayWeight = new int[120];

        for (int i = 0; i < arrayDiameter.length; i++)
        {
            arrayDiameter[i] = 20 + (int) (Math.random() * 8);
        }

        for (int i = 0; i < arrayWeight.length; i++)
        {
            arrayWeight[i] = 70 + (int) (Math.random() * 8);
        }

        BallCheck ballCheck = new BallCheck(arrayDiameter, arrayWeight);

        ballCheck.outputReport();
    }
}
