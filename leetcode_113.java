/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
  public List<List<Integer>> pathSum(TreeNode root, int sum) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (root == null) {
      return result;
    }
    List<Integer> vals = new ArrayList<Integer>();
    helper(root, sum, result, vals, 0);
    return result;
  }
  private void helper(TreeNode node, int sum, List<List<Integer>> result, List<Integer> vals, int cur) {
    if (node == null) {
      return;
    }
    cur += node.val;
    List<Integer> new_vals = new ArrayList<Integer>(vals);
    new_vals.add(node.val);
    if (cur == sum && node.left == null && node.right == null) {
      result.add(new_vals);
    }
    helper(node.left, sum, result, new_vals, cur);
    helper(node.right, sum, result, new_vals, cur);
  }
}
