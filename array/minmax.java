package uni.array;
import java.util.*;

public class minmax
{
    public static Pair<Integer, Integer> getMinMax(int[] array)
    {
        if (array == null || array.length == 0)
        {
            throw new IllegalArgumentException("Array cannot be empty!");
        }


        int min = array[0];
        int max = array[0];
        for (int num : array)
        {
            if (num < min)
            {
                min = num;
            }
            if (num > max)
            {
                max = num;
            }
        }

        return new Pair<>(min, max);
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(getMinMax(a));
    }
}
