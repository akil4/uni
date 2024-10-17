public class sumandXOR
{
    public static void main(String[] args)
    {
        sumandXOR object = new sumandXOR();
        object.orderedPairs(9, 5);
        object.orderedPairs(2, 2);
    }
    public void orderedPairs(int S, int K)
    {
        int count = 0;
        for(int i = 0; i < S; i++)
        {
            for(int j = 0; j < S; j++)
            {
                int result = i ^ j;
                if(i + j == S && result == K)
                {
                    //System.out.print(i + " " + j + "\t");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}