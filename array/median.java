package uni.array;

public class median
{
    public static double findMedian(int[] array1, int[] array2)
    {
        int l1 = array1.length, l2 = array2.length, length = l1 + l2, l = 0, r = length - 1, i = 0, j = 0, k = 0;
        int[] result = new int[length];

        while (i < l1 && j < l2)
        {
            if (array1[i] <= array2[j])
            {
                result[k++] = array1[i++];
            }
            else{
                result[k++] = array2[j++];
            }
        }
        while (i < l1)
        {
            result[k++] = array1[i++];
        }
        while (j < l2)
        {
            result[k++] = array2[j++];
        }

        if (length % 2 != 0)
        {
            while (l != r)
            {
                l++;
                r--;
            }
            return (double)result[l];
        }
        else
        {
            while (l < r)
            {
                l++;
                r--;
            }
            return ((double)result[l] + (double)result[r]) / (double)2;
        }
    }

    public static void main(String[] args)
    {
        int[] array1 = {8, 9, 11, 100, 123};
        int[] array2 = {2, 4, 10};
        System.out.println(findMedian(array1, array2));
    }
}
