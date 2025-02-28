public class topLeftTrianglePattern
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
            for (int j = 0; j < N - i; j++)
            {
                System.out.print(count++ + "\t");
                /* 
                System.out.print(j + "\t"); 
                
                01234
                0123
                012
                01
                0

                */
                /* 
                System.out.print("# "); 
                 
                # # # # #
                # # # #
                # # #
                # #
                #

                */
            }
            System.out.println();
        }
    }
}
