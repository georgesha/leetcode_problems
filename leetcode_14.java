class Solution {
    public String longestCommonPrefix(String[] strs) {
      if (strs == null || strs.length == 0) {
        return "";
      }
      StringBuilder sb = new StringBuilder(strs[0]);
      for (int i = 1; i < strs.length; i++) {
        char[] arr = strs[i].toCharArray();
        for (int j = 0; j < arr.length; j++) {
          if (j > sb.length() - 1) {
            continue;
          }
          if (sb.charAt(j) != arr[j]) {
            sb = sb.delete(j, sb.length());
          }
        }
        if (sb.length() > arr.length) {
          sb = sb.delete(arr.length, sb.length());
        }
      }
      return sb.toString();
    }
}
