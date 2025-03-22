package uni.array;
import java.util.*;

public class arrayLeader
{
    public static ArrayList<Integer> findLeader(int[] array)
    {
        ArrayList<Integer> result = new ArrayList<>();
        int n = array.length, maxRight = array[n - 1];
        result.add(maxRight);
        for (int i = n - 2; i >= 0; i--)
        {
            if (array[i] >= maxRight)
            {
                maxRight = array[i];
                result.add(maxRight);
            }
        }
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args)
    {
        int[] a = {16, 17, 4, 3, 5, 2};
        System.out.println(findLeader(a));
    }
}
