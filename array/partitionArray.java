package uni.array;

public class partitionArray
{
    public static void threeWayPartition(int[] array, int a, int b)
    {
        int low = 0, mid = 0, high = array.length - 1;
        while (mid <= high)
        {
            if (array[mid] < a)
            {
                int temp = array[low];
                array[low] = array[mid];
                array[mid] = temp;
                low++;
                mid++;
            }
            else if (array[mid] >= a && array[mid] <= b)
            {
                mid++;
            }
            else
            {
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
                high--;
            }
        }

        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] array = {1, 4, 3, 6, 2, 1};
        int a = 1, b = 3;
        threeWayPartition(array, a, b);
    }    
}
