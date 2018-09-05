class Solution {
    public int romanToInt(String s) {
      char[] arr = s.toCharArray();
      Map<Character, Integer> map = new HashMap<Character, Integer>();
      map.put('I', 1);
      map.put('V', 5);
      map.put('X', 10);
      map.put('L', 50);
      map.put('C', 100);
      map.put('D', 500);
      map.put('M', 1000);
      int result = 0;
      for (int i = 0; i < arr.length; i++) {
        if (arr[i] != 'I' && arr[i] != 'X' && arr[i] != 'C' || i == arr.length - 1) {
          result += map.get(arr[i]);
        }
        else {
          if ((arr[i] == 'I' && (arr[i + 1] == 'V' || arr[i + 1] == 'X')) || (arr[i] == 'X' && (arr[i + 1] == 'L' || arr[i + 1] == 'C')) || (arr[i] == 'C' && (arr[i + 1] == 'D' || arr[i + 1] == 'M'))) {
            result += map.get(arr[i + 1]) - map.get(arr[i]);
            i++;
          }
          else {
            result += map.get(arr[i]);
          }
        }
      }
      return result;
    }
}
