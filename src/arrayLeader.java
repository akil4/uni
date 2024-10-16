import java.util.*;
public class arrayLeader
{
    Scanner sc = new Scanner (System.in);
    public static void main (String[] args)
    {
        arrayLeader obj = new arrayLeader();
        obj.findArrayLeader();
    }
    public void findArrayLeader ()
    {
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++)
        {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++)
        {
            
            for (int j = i + 1; j < size - 1; j++)
            {
                if (array[i] == array[j])
                {
                    System.out.print(array[i] + " ");
                } 
                else if (array[j] > array[i])
                {
                    System.out.print(array[j] + " ");
                }
                else
                {
                    break;
                }
            }
            if (i == size - 1)
            {
                System.out.print(array[i]);
            }
        }
        System.out.println();
    }
}