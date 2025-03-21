
public class squarePattern
{
    public static void main(String[] args)
    {
        printPattern(5);
    }
    class Extract
    {
        public static long extractNumber(String s)
        { 
            String[] words= s.split(" ");
            long maxNum=-1;
            for(String i: words)
            {
                if(i.matches("\\d+"))
                {
                    if(!i.contains("9"))
                    {
                        long num=Long.parseLong(i);
                        maxNum=Math.max(maxNum,num);
                    }
                }
            }
            return maxNum;
    }
    public static void main(String[]args)
    {
        String s1="welcome123! b78";
        System.out.println(extractNumber(s1));
    
    }
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