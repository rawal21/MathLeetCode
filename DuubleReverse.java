class Solution {
  public boolean isSameAfterReversals(int num) {
      // Step 1: If the number is 0, it remains unchanged
      if (num == 0) return true;

      // Step 2: If the number has trailing zeros, it changes after double reversal
      if (num % 10 == 0) return false;

      // Step 3: Otherwise, it remains the same after double reversal
      return true;
  }
}
