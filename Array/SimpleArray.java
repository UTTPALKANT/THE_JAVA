package Array;
import java.util.*;;
public class SimpleArray{


    

        // Function to check if a number is prime
        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            if (num == 2 || num == 3) {
                return true;
            }
            if (num % 2 == 0) {
                return false;
            }
            for (int i = 3; i <= Math.sqrt(num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public static void main(String[] args) {
            int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
            };
    
            System.out.println("Prime numbers in the 2D array:");
    
            // Traverse the 2D array and find prime numbers
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (isPrime(arr[i][j])) {
                        System.out.print(arr[i][j] + " ");
                    }
                    if(i == 7){
                        
                    }
                }
            }

        }
    }
    