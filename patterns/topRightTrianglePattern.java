public class topRightTrianglePattern 
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
            for (int j = 0; j < i; j++)
            {
                System.out.print("\t");
                /* System.out.print("  "); */
            }
            for (int j = i; j < N; j++)
            {
                System.out.print(count++ + "\t");
                /* 
                System.out.print(j + "\t"); 
                
                01234
                 1234
                  234
                   34
                    4
                
                */
                /* 
                System.out.print("# "); 
                
                #####
                 ####
                  ###
                   ##
                    #
                   
                   */
            }
            System.out.println();
        }
    }
}
