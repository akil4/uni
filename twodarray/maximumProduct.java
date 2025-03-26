package uni.twodarray;

public class maximumProduct
{
    public static int maxProduct(int[] array)
    {
        int maxProduct = array[0], minProduct = array[0], result = array[0];
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < 0)
            {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(array[i], maxProduct * array[i]);
            minProduct = Math.min(array[i], minProduct * array[i]);
            result = Math.max(result, maxProduct);
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] a = {-2, 6, -3, -10, 0, 2};
        System.out.println(maxProduct(a));
    }
}
