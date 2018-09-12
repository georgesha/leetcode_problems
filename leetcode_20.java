class Solution {
  public boolean isValid(String s) {
  Stack<Character> stack = new Stack<Character>();
  Map<Character, Character> map = new HashMap<Character, Character>();
  map.put('(', ')');
  map.put('[', ']');
  map.put('{', '}');
  char[] arr = s.toCharArray();
  for (int i = 0; i < arr.length; i++) {
    if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{') {
      stack.push(arr[i]);
    }
    else {
      if (stack.size() == 0) {
        return false;
      }
      char cur = stack.pop();
      if (map.get(cur) != arr[i]) {
        return false;
      }
    }
  }
  if (stack.size() != 0) {
    return false;
  }
  return true;
 }
}
