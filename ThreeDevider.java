class Solution {
  public boolean isThree(int n) {
      int count = 0; // Count the number of divisors

      // Iterate from 1 to sqrt(n)
      for (int i = 1; i * i <= n; i++) {
          if (n % i == 0) { // If 'i' is a divisor
              count++; // Count 'i'
              if (i != n / i) { // If it's not a perfect square, count 'n/i'
                  count++;
              }
          }
          if (count > 3) { // If divisors exceed 3, return false early
              return false;
          }
      }

      // Return true only if there are exactly 3 divisors
      return count == 3;
  }

  // Main method for testing
  public static void main(String[] args) {
      Solution solution = new Solution();
      System.out.println(solution.isThree(9));  // True (Divisors: {1, 3, 9})
      System.out.println(solution.isThree(10)); // False (Divisors: {1, 2, 5, 10})
      System.out.println(solution.isThree(4));  // True (Divisors: {1, 2, 4})
      System.out.println(solution.isThree(25)); // True (Divisors: {1, 5, 25})
      System.out.println(solution.isThree(16)); // False (Divisors: {1, 2, 4, 8, 16})
  }
}
