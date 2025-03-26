package uni.array;
import java.util.*;
public class sum {
    public static void Sum(int[]arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        sum += arr[i];
        }
        System.out.print(sum);
    }
    public static void main(String[]args)
    {
        int a[]={2,4,5,6,8,9};
        Sum(a);
    }
}

