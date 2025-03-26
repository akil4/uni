package uni.array;
import java.util.*;

public class minRemove
{
    public static int removeElements(int[] arr,int n, int K)
    {
        Arrays.sort(arr);
        int minRemovals = n;
        int j = 0;
        for (int i = 0; i < n; i++)
        {
            while (j < n && arr[j] - arr[i] <= K)
            {
                j++;
            }
            int validSubArraySize = j - i;
            minRemovals = Math.min(minRemovals, n - validSubArraySize);
        }
        return minRemovals;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 3, 4, 9, 10, 11, 12, 17, 20};
        int n = a.length;
        int k = 4;
        System.out.println(removeElements(a, n, k));
    }
}
