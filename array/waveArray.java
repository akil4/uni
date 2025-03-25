package uni.array;

public class waveArray
{
    public static void convertToWave(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n - 1; i += 2)
        {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }

        for (int i : array)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        convertToWave(a);
    }
}
