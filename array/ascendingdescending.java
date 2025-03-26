package uni.array;
import java.util.*;

public class ascendingdescending {
    public static void ascendingAndDescending(int[]arr)
    {
        Arrays.sort(arr);
      
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    Arrays.sort(arr);

}

public static void main(String[]args)
{
    int a[]={3,2,6,1,5};
    ascendingAndDescending(a);
}
}
