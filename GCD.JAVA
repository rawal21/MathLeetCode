import java.util.Arrays;

class Solution {
    public int findGCD(int[] nums) {
        // Step 1: Find the smallest and largest number in the array
        int minNum = Arrays.stream(nums).min().getAsInt();
        int maxNum = Arrays.stream(nums).max().getAsInt();
        
        // Step 2: Compute the GCD of minNum and maxNum
        return gcd(minNum, maxNum);
    }

    // Helper function to calculate GCD using Euclidean Algorithm
    private int gcd(int a, int b) {
        while (b != 0) {  // Continue until remainder becomes 0
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;  // GCD found
    }

    // Alternative Recursive Approach
    private int gcdRecursive(int a, int b) {
        return b == 0 ? a : gcdRecursive(b, a % b);
    }
}
