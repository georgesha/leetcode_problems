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
  public List<Integer> rightSideView(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if (root == null) {
      return result;
    }
    helper(root, result, 0);
    return result;
  }
  private void helper(TreeNode node, List<Integer> result, int cur) {
    if (node == null) {
      return;
    }
    if (cur == result.size()) {
      result.add(node.val);
    }
    helper(node.right, result, cur + 1);
    helper(node.left, result, cur + 1);
  }
}
