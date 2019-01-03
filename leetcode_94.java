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
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<Integer>();
    if (root == null) {
      return result;
    }
    helper(root, result);
    return result;
  }
  private void helper(TreeNode node, List<Integer> result) {
    if (node == null) {
      return;
    }
    if (node.left == null && node.right == null) {
      result.add(node.val);
      return;
    }
    if (node.left != null) {
      helper(node.left, result);
    }
    result.add(node.val);
    if (node.right != null) {
      helper(node.right, result);
    }
  }
}
