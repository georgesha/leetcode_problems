class Solution {
  public int coinChange(int[] coins, int amount) {
    if (coins == null || coins.length == 0) {
      return -1;
    }
    int[] mins = new int[amount + 1];
    mins[0] = 0;
    for (int i = 1; i <= amount; i++) {
      int min = Integer.MAX_VALUE;
      for (int coin:coins) {
        if (coin <= i && mins[i - coin] != Integer.MAX_VALUE) {
          min = Math.min(min, mins[i - coin] + 1);
        }
      }
      mins[i] = min;
    }
    if (mins[amount] == Integer.MAX_VALUE) {
      return -1;
    }
    return mins[amount];
  }
}
