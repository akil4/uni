package uni.array;
import java.util.Arrays;
import java.util.*;
public class insert {
    public static void Insert(int[] arr, int index, int value) {
        int[] newArr = new int[arr.length + 1];
        
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        
        newArr[index] = value;
        
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

         System.out.print(Arrays.toString(newArr));
         
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        Insert(a, 2, 12);
    }
}

