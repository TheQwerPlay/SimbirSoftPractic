public class BallCheck
{
    int[] arrayDiameter;
    int[] arrayWeight;

    public BallCheck(int[] arrayDiameter, int[] arrayWeight)
    {
        this.arrayDiameter = arrayDiameter;
        this.arrayWeight = arrayWeight;
    }

    public void outputReport()
    {
        for (int i = 0; i < arrayDiameter.length; i++)
        {
            System.out.print(i + ": Шар имеет вес " + arrayWeight[i] + " и его диаметр составляет " + arrayDiameter[i]);
            if ((arrayDiameter[i] >= 22 && arrayDiameter[i] <= 26) && (arrayWeight[i] >= 71 && arrayWeight[i] <= 77))
            {
                System.out.println(": ГОСТ.");
            }
            else
            {
                System.out.println(": брак.");
            }
        }
    }

}


