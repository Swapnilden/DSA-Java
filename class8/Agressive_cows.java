// https://www.spoj.com/problems/AGGRCOW/
import java.util.Arrays;
import java.util.Scanner;

public class Aggresive_Cows {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Read the number of test cases
        for (int i = 0; i < t; i++) {
            int N = scanner.nextInt();
            int C = scanner.nextInt();
            int[] stalls = new int[N];
            for (int j = 0; j < N; j++) {
                stalls[j] = scanner.nextInt();  // Read each stall position
            }
            Arrays.sort(stalls);  // Sort the stall positions
            System.out.println(largestMinDistance(stalls, C));  // Compute and print the result
        }
        scanner.close();
    }
    
    // Function to find the largest minimum distance
    public static int largestMinDistance(int[] stalls, int C) {
        int low = 1;  // Minimum possible distance
        int high = stalls[stalls.length - 1] - stalls[0];  // Maximum possible distance
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canPlaceCows(stalls, C, mid)) {
                low = mid + 1;  // Try for a larger minimum distance
            } else {
                high = mid - 1;  // Reduce the minimum distance
            }
        }
        return high;  // The largest minimum distance found
    }
    
    // Check if it is possible to place C cows with at least distance d
    public static boolean canPlaceCows(int[] stalls, int C, int d) {
        int count = 1;  // First cow placed at the first stall
        int lastPosition = stalls[0];
        
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= d) {
                count++;
                lastPosition = stalls[i];
                if (count == C) {
                    return true;  // Successfully placed all cows
                }
            }
        }
        return false;  // Could not place all cows with at least distance d
    }
}
