import java.util.Arrays;

class Solution {
    public int minimumSum(int num) {
        // Step 1: Extract digits from num
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10;  // Extract last digit
            num /= 10;  // Remove last digit
        }

        // Step 2: Sort digits in ascending order
        Arrays.sort(digits);

        // Step 3: Form two smallest two-digit numbers
        int num1 = digits[0] * 10 + digits[2];  // First smallest + Third smallest
        int num2 = digits[1] * 10 + digits[3];  // Second smallest + Fourth smallest

        // Step 4: Return the sum
        return num1 + num2;
    }
}
