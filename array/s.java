package uni.array;

import java.util.ArrayList;

public class s {
    static ArrayList<Integer> so(int arr[]) {
        ArrayList<Integer> l = new ArrayList<>();
        int n = arr.length;
        
        // Iterate from left to right
        for (int i = 0; i < n; i++) {
            int var1 = arr[i];
            boolean flag = true;

            // Compare with elements to the right of arr[i]
            for (int j = i + 1; j < n; j++) {
                if (var1 < arr[j]) {
                    flag = false;
                    break;
                }
            }

            // If no element to the right is greater, add it as a leader
            if (flag) {
                l.add(var1);
            }
        }

        return l;
    }

    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        System.out.println(so(a));  // Output will be [17, 5, 2]
    }
}
