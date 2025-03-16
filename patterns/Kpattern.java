public class Kpattern
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
            for(int j = 0; j < N - i; j++)
            {
                System.out.print(count++ + "\t");
                /* System.out.print(j + "\t"); */
                /* System.out.print("# "); */
            }
            System.out.println();
        }
        count--;
        for (int i = 1; i < N; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print(--count + "\t");
                /* System.out.print(count++ + "\t"); 
          
                    0   1   2   3   4
                    5   6   7   8
                    9   10  11
                    12  13
                    14
                    15  16
                    17  18  19
                    20  21  22  23
                    24  25  26  27  28
          
                */
                /* 
                System.out.print(j + "\t"); 
                
                01234
                0123
                012
                01
                0
                01
                012
                0123
                01234
                
                */
                /* 
                System.out.print("# "); 
                
                #####
                ####
                ###
                ##
                #
                ##
                ###
                ####
                #####

                */
            }
            System.out.println();
        }
    }
}
