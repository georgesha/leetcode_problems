class Solution {
  public String addBinary(String a, String b) {
      char[] a_arr = a.toCharArray();
      char[] b_arr = b.toCharArray();
      char[] longer = a_arr.length >= b_arr.length?a_arr:b_arr;
      char[] shorter = a_arr.length < b_arr.length?a_arr:b_arr;
      int[] arr = new int[longer.length];
      Arrays.fill(arr, 0);
      for (int i = 1; i < shorter.length + 1; i++) {
        int cur = Character.getNumericValue(longer[longer.length - i]) + Character.getNumericValue(shorter[shorter.length - i]);
        arr[arr.length - i] = cur;
      }
      for (int i = shorter.length + 1; i < longer.length + 1; i++) {
        arr[arr.length - i] = Character.getNumericValue(longer[longer.length - i]);
      }
      boolean inc = false;
      for (int i = arr.length - 1; i >= 0; i--) {
        if (inc == true) {
          arr[i]++;
          inc = false;
        }
        if (arr[i] > 1) {
          inc = true;
          arr[i] -= 2;
        }
      }
      String result = inc == true?"1":"";
      for (int i:arr) {
        result += Integer.toString(i);
      }
      return result;
    }
}
