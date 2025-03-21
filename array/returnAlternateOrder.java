package uni.array;
import java.util.ArrayList;

public class returnAlternateOrder
{
    public static ArrayList<Integer> getAlternates(int array[])
    {
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2)
        {
            A.add(array[i]);
        }

        return A;
    }

    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(getAlternates(a));
    }
}
