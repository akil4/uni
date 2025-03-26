package uni.array;
import java.util.*;

public class longestArithmeticProgression
{
    public static int length(int[] arr)
    {
        int n = arr.length;
        if (n <= 2)
        {
            return n;
        }
        int[][] dp = new int[n][n];
        int maxLen = 2;
        for (int i = 0; i < n; i++)
        {
            Arrays.fill(dp[i], 2);
        }
        for (int j = n - 2; j >= 0; j--)
        {
            int i = j - 1;
            int k = j + 1;
            while (i >= 0 && k < n)
            {
                if (arr[i] + arr[k] == 2 * arr[j])
                {
                    dp[i][j] = dp[j][k] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                    i--;
                    k++;
                }
                else if (arr[i] + arr[k] < 2 * arr[j])
                {
                    k++;
                }
                else
                {
                    i--;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 7, 10, 15, 27, 29};
        System.out.println(length(a));
    }
}
