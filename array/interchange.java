package uni.array;
public class interchange {
        public static void interchangePositions(int[] arr) {
            for (int i = 0; i < arr.length-1; i += 2) {
                int temp =arr[i] ;
               arr[i] = arr[i + 1];
                arr[i + 1]= temp;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
            }
        }
    
        public static void main(String[] args) {
            int arr[] = {1, 2, 3, 4, 5, 6, 7, 8,9};
            interchangePositions(arr);
        }
    }
    
