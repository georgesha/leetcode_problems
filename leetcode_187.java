class Solution {
  public List<String> findRepeatedDnaSequences(String s) {
    List<String> result = new ArrayList<String>();
    if (s.length() < 10) {
      return result;
    }
    HashSet<String> hash = new HashSet<String>();
    for (int i = 0; i < s.length() - 10; i++) {
      String cur = s.substring(i, i + 10);
      if (hash.contains(cur)) {
        if (!result.contains(cur)) {
          result.add(cur);
        }
      }
      else {
        hash.add(cur);
      }
    }
    return result;
  }
}
