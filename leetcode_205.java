class Solution {
  public boolean isIsomorphic(String s, String t) {
    char[] arr1 = s.toCharArray();
    char[] arr2 = t.toCharArray();
    HashMap<Character, Character> map = new HashMap<Character, Character>();
    for(int i = 0; i < arr1.length; i++) {
      if(map.containsKey(arr1[i]) && map.get(arr1[i]) != arr2[i]) {
        return false;
      }
      else if(!map.containsKey(arr1[i])) {
        if(!map.containsValue(arr2[i])) {
          map.put(arr1[i], arr2[i]);
        }
        else {
          return false;
        }
      }
    }
    return true;
  }
}
