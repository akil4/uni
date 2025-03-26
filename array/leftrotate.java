package uni.array;

public class leftrotate {

    // Function to perform left rotation on the array
    public static void leftRotate(int[] arr, int d) {
        int n = arr.length;
       
        d = d % n; 

        
        reverse(arr, 0, d - 1);
        
        
        reverse(arr, d, n - 1);
        
       
        reverse(arr, 0, n - 1);
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }

    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method for testing the leftRotate function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 2; // Number of positions to rotate left
       // System.out.println("Original Array: " + Arrays.toString(arr));
        
        leftRotate(arr, d);
        
        //System.out.println("Array after " + d + " left rotations: " + Arrays.toString(arr));
    }
}

