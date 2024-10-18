import java.util.*;
public class commonElements
{
    public static void main(String[] args)
    {
        commonElements object = new commonElements();
        object.getInput();
    }
    public void getInput()
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the size of the array1: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.print("Enter the size of the array2: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter array1 elements: ");
        for (int i = 0; i < size1; i++)
        {
            array1[i] = scanner.nextInt();
        }
        System.out.println("Enter array2 elements: ");
        for (int i = 0; i < size2; i++)
        {
            array2[i] = scanner.nextInt();
        }
        commonElements object = new commonElements();
        object.findCommonElements(array1, array2);
    }
    public void findCommonElements(int[] array1, int[] array2)
    {
        int[] arraySolution = new int[array1.length];
        int sum = 0;
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if (array1[i] == array2[j])
                {
                    arraySolution[i] = array2[j];
                }
            }
        }
        for(int i = 0; i < arraySolution.length; i++)
        {
            sum = sum + arraySolution[i];
        }
        System.out.println(sum);
    }
}
