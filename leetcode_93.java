class Solution {
  public List<String> restoreIpAddresses(String s) {
    List<String> result = new ArrayList<String>();
    if (s.length() == 0) {
      return result;
    }
    address(s, result, "", 0, 0);
    return result;
  }
  private void address(String s, List<String> result, String cur, int index, int count) {
    if (count > 4) {
      return;
    }
    if (index == s.length() && count == 4) {
      result.add(cur);
      return;
    }
    for (int i = 1; i < 4; i++) {
      if (index + i > s.length()) {
        break;
      }
      String sub = s.substring(index, index + i);
      if (sub.startsWith("0") && sub.length() > 1 || Integer.parseInt(sub) > 255) {
        continue;
      }
      address(s, result, cur + sub + (count == 3? "" : "."), index + i, count + 1);
    }
  }
}
