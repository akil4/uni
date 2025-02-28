public class bottomLeftTrianglePattern
{
    public static void main(String[] args)
    {
        printPattern(5);
    }

    public static void printPattern(int N)
    {
        int count = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(count++ + "\t");
                /* 
                System.out.print(j + "\t");
                 
                0
                0	1
                0	1	2
                0	1	2	3
                0	1	2	3	4

                 */
                /* 
                System.out.print(" #"); 
                 
                #
                # #
                # # #
                # # # #
                # # # # #

                */
            }
            System.out.println();
        }
    }
}
