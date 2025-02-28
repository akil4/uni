
public class squarePattern
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
            for (int j = 0; j < N; j++)
            {
                System.out.print(count++ + "\t");
                /*
                System.out.print(j); 
                
                01234
                01234
                01234
                01234
                01234

                */
                /*
                System.out.print("#"); 
                
                #####
                #####
                #####
                #####
                #####
                
                */
            }
            System.out.println();
        }
    }
}