package uni.array;
import java.util.*;

public class twoSum
{
    public static ArrayList<Integer> sum(int[] array, int target)
    {
        int l = array.length;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < l - 1; i++)
        {
            for (int j = i + 1; j < l; j++)
            {
                if (array[i] + array[j] == target)
                {
                    result.add(i);
                    result.add(j);
                }
            }
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sum(a, 13));
    }
}