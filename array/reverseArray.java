package uni.array;

public class reverseArray
{
    public static void reverse(int[] array)
    {
        int left = 0, right = array.length - 1;

        while (left < right)
        {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        for (int i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] a = {2, 6, 7, 1, 3, 4, 5};
        reverse(a);
    }
}
