class Solution {
  public int compareVersion(String version1, String version2) {
    String[] v1_arr = version1.split("\\.");
    String[] v2_arr = version2.split("\\.");
    int index = 0;
    while (index < v1_arr.length && index < v2_arr.length) {
      if (Integer.parseInt(v1_arr[index]) > Integer.parseInt(v2_arr[index])) {
        return 1;
      }
      else if (Integer.parseInt(v1_arr[index]) < Integer.parseInt(v2_arr[index])) {
        return -1;
      }
      index++;
    }
    if (v1_arr.length > v2_arr.length) {
      for (int i = index; i < v1_arr.length; i++) {
        if (Integer.parseInt(v1_arr[i]) > 0) {
          return 1;
        }
      }
      return 0;
    }
    else if (v1_arr.length < v2_arr.length) {
      for (int i = index; i < v2_arr.length; i++) {
        if (Integer.parseInt(v2_arr[i]) > 0) {
          return -1;
        }
      }
      return 0;
    }
    else {
      return 0;
    }
  }
}
