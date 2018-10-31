class Solution {
  public boolean isHappy(int n) {
    if(n <= 0) {
      return false;
    }
    HashSet<Integer> exist = new HashSet<Integer>();
    while(n > 1) {
      exist.add(n);
      int cur = 0;
      while(n > 0) {
        cur += Math.pow((n % 10), 2);
        n /= 10;
      }
      n = cur;
      if (exist.contains(n)) {
        return false;
      }
    }
    if (n == 1) {
      return true;
    }
    else {
      return false;
    }
  }
}
