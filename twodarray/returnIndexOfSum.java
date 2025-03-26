package uni.twodarray;
import java.util.*;

public class returnIndexOfSum
{
    public static boolean returnSum(int[] array, int target)
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < array.length; i++)
        {
            if (hs.contains(target - array[i]))
            {
                return true;
            }
            hs.add(array[i]);
        }

        return false;

        /* // Arrays.sort(array);
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                sum = array[i] + array[j];
                if (sum == target)
                {
                    return true;
                }
            }
        }
        return false; */
    }

    public static void main(String[] args)
    {
        int[] a = {4, 2, 3, 1, 5};
        int target = 6;
        System.out.println(returnSum(a, target));
    }
}
