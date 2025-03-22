package uni.array;
import java.util.*;

public class formTriangle
{
    public static int numberOfTriangles(int[] array)
    {
        int n = array.length;
        if (n < 3)
            return 0;
        
        Arrays.sort(array);
        int count = 0;
        for (int k = n - 1; k >= 2; k--)
        {
            int i = 0, j = k - 1;
            while (i < j)
            {
                if (array[i] + array[j] > array[k])
                {
                    count += (j - i);
                    j--;
                }
                else
                {
                    i++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args)
    {
        int[] a = {4, 6, 3, 7};
        System.out.println(numberOfTriangles(a));
    }
}
