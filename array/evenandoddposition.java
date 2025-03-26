package uni.array;
import java.util.*;
import java.util.Arrays;
public class evenandoddposition {
    public static void  evenOddPosition(int[]arr)
    {
        int evensum=0,oddsum=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                System.out.print(arr[i]+" ");
                evensum += arr[i];
            }
        }
        System.out.println();

        for(int i=0;i<arr.length;i++)
            {
                if(i%2!=0)
                {
                System.out.print(arr[i]+" ");
            
                oddsum += arr[i];
                }  
        }
        System.out.println();
        System.out.println(evensum);
        System.out.println(oddsum);
            
    }
    public static void main(String[]args)
    {
        int a[]={2,5,6,8,9,3,1,0};
        evenOddPosition(a);
    }
    
}
