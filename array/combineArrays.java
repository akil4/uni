package uni.array;
import java.util.*;

public class combineArrays
{
    public static ArrayList<Integer> joinArray(int[] arr1, int[] arr2, int k)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++)
        {
            result.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++)
        {
            result.add(arr2[i]);
        }
        Collections.sort(result);
       
            return new ArrayList<>(result); 
    }

        
    
    public static void main(String[] args)
    {
        int[] a1 = {1, 3};
        int[] a2 = {2};
        int k = 2;
        System.out.println(joinArray(a1, a2, k));
    }
}
