package uni.array;

public class maxLength
{
    public static int findMax(int[] price)
    {
        int n = price.length;
        int[] dp = new int[n + 1];
        for (int i = 1; i <= n; i++)
        {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 1; j <= i; j++)
            {
                maxVal = Math.max(maxVal, price[j - 1] + dp[i - j]);
            }
            dp[i] = maxVal;
        }
        return dp[n];
    }

    public static void main(String[] args)
    {
        int[] a = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(findMax(a));
    }
}
