class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (candidates == null || candidates.length == 0) {
      return result;
    }
    List<Integer> cur = new ArrayList<Integer>();
    helper(result, candidates, target, cur, 0);
    return result;
  }
  private void helper(List<List<Integer>> result, int[] candidates, int target, List<Integer> cur, int index) {
    if (target > 0) {
      for (int i = index; i < candidates.length; i++) {
        cur.add(candidates[i]);
        helper(result, candidates, target - candidates[i], cur, i);
        cur.remove(cur.size() - 1);
      }
    }
    if (target == 0) {
      result.add(new ArrayList<Integer>(cur));
    }
  }
}
