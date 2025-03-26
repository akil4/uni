package uni.twodarray;
import java.util.*;

public class tripletSumIsZero
{
    public static boolean tripletSum(int[] array)
    {
        Arrays.sort(array);
        for (int i = 0; i  < array.length - 2; i++)
        {
            int left = i + 1;
            int right = array.length - 1;
            while (left < right)
            {
                int sum = array[i] + array[left] + array[right];
                if (sum == 0)
                {
                    return true;
                }
                else if (sum < 0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        int[] a = {0, -1, 2, -3, 1};
        System.out.println(tripletSum(a));
    }
}
