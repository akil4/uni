public class arrangeOddEvenNumbers 
{
    public static void main(String[] args)
    {
        int[] arr = {3, 6, 12, 1, 5, 8};
        int N = arr.length;
        arrangeOddEvenNumbers object = new arrangeOddEvenNumbers();
        object.reArrange(arr, N);
    }  
    public void reArrange(int[] arr, int N)
    {
        // Create an array to store the arranged elements
        int[] arraySolution = new int[N + 1];
        int even = 0, odd = 1;
        // Check if number is odd or even
        // If number is odd, place it in odd index
        // If number is even, place it in even index
        for(int i = 0; i < N; i++)
        {
            if(arr[i] % 2 == 0)
            {
                arraySolution[even] = arr[i];
                even += 2;
            }
            else if(arr[i] % 2 != 0)
            {
                arraySolution[odd] = arr[i];
                odd += 2;
            }
        }
        /* // Print the arranged elements
        for(int i = 0; i < N; i++)
        {
            System.out.print(arraySolution[i] + " ");
        }
        System.out.println(); */
    }  
}
