package uni.array;
import java.util.*;

public class kthSmallestElement
{
    public static int smallestElement(int[] array, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : array)
        {
            pq.add(num);
        }
        for (int i = 0; i < k - 1; i++)
        {
            pq.poll();
        }

        return pq.poll();
    }

    public static void main(String[] args)
    {
        int[] array = {9, 3,7,8,1};
        System.out.println(smallestElement(array, 5));
    }
}
