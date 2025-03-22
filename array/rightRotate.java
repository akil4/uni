package uni.array;

public class rightRotate
{
    public static void rotate(int[] array, int d)
    {
        int n = array.length;
        d = d % n;
        reverse(array, n - d, n - 1);
        reverse(array, 0, n - d - 1);
        reverse(array, 0, n - 1);

        for (int i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    

    public static void reverse(int[] array, int start, int end)
    {
        while (start < end)
        {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args)
    {
        int[] a = {2, 6, 7, 1, 3, 4, 5};
        rotate(a, 2);
}
}