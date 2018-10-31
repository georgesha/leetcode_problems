class Solution {
  public int countPrimes(int n) {
    if (n <= 1) {
      return 0;
    }
    int count = 0;
    for(int i = 2; i < n; i++) {
      boolean flag = true;
      for(int j = 2; j < i; j++) {
        if(i % j == 0) {
          flag = false;
          break;
        }
      }
      if (flag == true) {
        count++;
      }
    }
    return count;
  }
}
