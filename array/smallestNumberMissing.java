package uni.array;

public class smallestNumberMissing
{
    public static int missingNumber(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n; i++)
        {
            while (array[i] > 0 && array[i] <= n && array[array[i] - 1] != array[i])
            {
                int temp = array[array[i] - 1];
                array[array[i] - 1] = array[i];
                array[i] = temp;
            }
        }

        for (int i = 0; i < n; i++)
        {
            if (array[i] != i + 1)
            {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args)
    {
        int[] a = {-1, -2, -3};
        System.out.println(missingNumber(a));
    }
}
