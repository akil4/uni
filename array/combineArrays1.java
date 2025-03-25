package uni.array;
import java.util.*;

public class combineArrays1
{
    public static int getKthElement(int[] arr1, int[] arr2, int k)
    {
        // Create a list to store the merged arrays
        ArrayList<Integer> result = new ArrayList<>();
        
        // Add elements from the first array
        for (int i = 0; i < arr1.length; i++)
        {
            result.add(arr1[i]);
        }

        // Add elements from the second array
        for (int i = 0; i < arr2.length; i++)
        {
            result.add(arr2[i]);
        }

        // Sort the combined array
        Collections.sort(result);

        // Check if k is valid
        if (k > 0 && k <= result.size()) {
            return result.get(k - 1); // Return the k-th element (1-based index)
        } else {
            throw new IllegalArgumentException("k is out of range");
        }
    }

    public static void main(String[] args)
    {
        int[] a1 = {1, 3};
        int[] a2 = {2};
        int k = 2;

        try {
            System.out.println("The k-th element is: " + getKthElement(a1, a2, k));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
