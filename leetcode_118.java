class Solution {
    public List<List<Integer>> generate(int numRows) {
      List<List<Integer>> result = new ArrayList<List<Integer>>();
      if (numRows == 0) {
        return result;
      }
      result.add(new ArrayList<Integer>(Arrays.asList(1)));
      for (int i = 1; i < numRows; i++) {
        List<Integer> level = new ArrayList<Integer>(Arrays.asList(1));
        for (int j = 1; j < i; j++) {
          List<Integer> pre = result.get(i - 1);
          level.add(pre.get(j - 1) + pre.get(j));
        }
        level.add(1);
        result.add(level);
      }
      return result;
    }
}
