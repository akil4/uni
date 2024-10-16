public class uniqueNumber 
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 2, 1, 4};
        uniqueNumber object = new uniqueNumber();
        object.singleNumber(array);
    }
    public int singleNumber(int[] array)
    {
        int[] arraySolution = new int[array.length];
        for(int i = 0; i < array.length; i++)
        {
            int count = 0;
            for(int j = 0; j < array.length; j++)
            {
                if(array[i] == array[j])
                {
                    count++;
                }
            }
            if(count == 1)
            {
                arraySolution[i] = array[i];
            }
        }
        sort(arraySolution);
        return 0;
    }
    public void sort(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i + 1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
