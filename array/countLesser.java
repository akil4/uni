package uni.array;

public class countLesser
{
    public static int count(int x, int[] array)
    {
        int count = 0;
        for (int num : array)
        {
            if (num <= x)
            {
                count++;
                System.out.print(num + " ");
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        int[] a = {2, 6, 7, 1, 3, 4, 5};
        System.out.println(count(4, a));
    }
}
