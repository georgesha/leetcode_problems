class Solution {
  public int lengthOfLastWord(String s) {
    char[] arr = s.toCharArray();
    if (arr.length == 0) {
      return 0;
    }
    int length = 0;
    for (int i = arr.length - 1; i >= 0; i--) {
      if (arr[i] == ' ' && length > 0) {
        break;
      }
      if (arr[i] != ' ') {
        length++;
      }
    }
    return length;
  }
}
