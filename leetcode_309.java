class Solution {
  public int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0) {
      return 0;
    }
    int b1 = -prices[0], b0 = -prices[0];
    int s2 = 0, s1 = 0, s0 = 0;

    for (int i = 1; i < prices.length; i++) {
      b0 = Math.max(s2 - prices[i], b1);
      s0 = Math.max(b1 + prices[i], s1);
      b1 = b0;
      s2 = s1;
      s1 = s0;
    }

    return s0;
  }
}
