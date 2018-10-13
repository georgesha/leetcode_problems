class Solution {
    public int maxProfit(int[] prices) {
      if (prices.length == 0) {
        return 0;
      }
      int max = 0;
      for (int i = prices.length - 1; i >= 0; i--) {
          for(int j = i; j >= 0; j--) {
            if (prices[i] > prices[j]) {
              max = Math.max(max, prices[i] - prices[j]);
            }
          }
      }
      return max;
    }
}
