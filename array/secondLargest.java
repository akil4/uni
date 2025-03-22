package uni.array;

public class secondLargest
{
    public static int getSecondLargest(int[] array)
    {
        int n = array.length;
        if (n < 2)
        {
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int num : array)
        {
            if (num > largest)
            {
                secondLargest = largest;
                largest = num;
            }
            else if (num > secondLargest && num < largest)
            {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args)
    {
        int[] a = {2, 6, 7, 1, 3, 4, 5};
        System.out.println(getSecondLargest(a));
    }
}
