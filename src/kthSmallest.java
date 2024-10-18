public class kthSmallest
{
    public static void main(String[] args)
    {
        kthSmallest object1 = new kthSmallest(5, 1);
        kthSmallest object2 = new kthSmallest(5, 5);
    }
    public kthSmallest(int X, int K)
    {
        for(int i = K; i <= X; i++)
        {
            int result = X | i;
            if(X + i == result)
            {
                System.out.println(i);
            }
        }
    }
}
