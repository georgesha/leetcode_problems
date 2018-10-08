class Solution {
    public int[] plusOne(int[] digits) {
      int first = digits[digits.length - 1] + 1;
      if (first < 10) {
        digits[digits.length - 1]++;
        return digits;
      }
      else {
        for (int i = digits.length - 1; i >= 0; i--) {
          int cur = digits[i] + 1;
          if (cur < 10) {
            digits[i]++;
            return digits;
          }
          else {
            digits[i] = 0;
          }
        }
        if (digits[0] == 0) {
          int[] result = new int[digits.length + 1];
          Arrays.fill(result, 0);
          result[0] = 1;
          return result;
        }
      }
      return digits;
    }
}
