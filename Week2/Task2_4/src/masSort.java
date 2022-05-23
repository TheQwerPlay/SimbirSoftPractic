public class masSort
{
    static double[] _nums;

    public masSort(double[] nums, int lenMas)
    {
        _nums = new double[lenMas];
        _nums = nums;
    }

    public static void minToMax()
    {
        System.out.println("В порядке возрастания:");
        double temp;
        for (int i = 0; i < _nums.length - 1; i++)
        {
            for (int j = i + 1; j < _nums.length; j++)
            {
                if (_nums[i] > _nums[j]) {
                    temp = _nums[i];
                    _nums[i] = _nums[j];
                    _nums[j] = temp;
                }
            }
        }
        printMas();
    }

    public static void maxToMin() {
        System.out.println("\nВ порядке убывания:");
        double temp;
        for (int i = 0; i < _nums.length - 1; i++)
        {
            for (int j = i + 1; j < _nums.length; j++)
            {
                if (_nums[i] < _nums[j]) {
                    temp = _nums[i];
                    _nums[i] = _nums[j];
                    _nums[j] = temp;
                }
            }
        }
        printMas();
    }

    private static void printMas()
    {
        for (int i = 0; i < _nums.length; i++)
        {
            System.out.print((i+1) + ": " + _nums[i] + " ");
        }
    }
}

