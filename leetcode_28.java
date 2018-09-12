class Solution {
  public int strStr(String haystack, String needle) {
    char[] fullArr = haystack.toCharArray();
    char[] targetArr = needle.toCharArray();
    // base case
    if (targetArr.length == 0) {
      return 0;
    }
    if (fullArr.length == 0 || targetArr.length > fullArr.length) {
      return -1;
    }
    if (targetArr.length == fullArr.length && haystack.equals(needle)) {
      return 0;
    }
    // two pointers
    int i = 0, j = 0;
    while(i < fullArr.length - targetArr.length + 1) {
      int cur = i;
      boolean flag = true;
      while (j < targetArr.length) {
        if (fullArr[i] != targetArr[j]) {
          i = cur + 1;
          j = 0;
          flag = false;
          break;
        }
        i++;
        j++;
      }
      if (flag == true) {
        return cur;
      }
    }
    return -1;
  }
}
