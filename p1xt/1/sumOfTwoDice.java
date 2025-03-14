public class sumOfTwoDice
{
    public static int sumOfIntegers()
    {
        int DICE = 6;
        int x = (int) (Math.random() * DICE) + 1;
        int y = (int) (Math.random() * DICE) + 1;
        return x + y;
    }
    public static void main(String[] args)
    {
        /* System.out.println("Sum of two dice = " + sumOfIntegers()); */
        for (;;)
        {
            System.out.println("Sum of two dice = " + sumOfIntegers());
            if (sumOfIntegers() == 12)
            {
                System.out.println("12");
                break;
            }
        }
    }
}
