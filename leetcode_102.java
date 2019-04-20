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
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> nodes = new LinkedList<TreeNode>();
    nodes.add(root);
    helper(result, nodes);
    return result;
  }

  private void helper(List<List<Integer>> result, Queue<TreeNode> nodes) {
    if (nodes.size() == 0) {
      return;
    }
    List<Integer> cur = new ArrayList<Integer>();
    Queue<TreeNode> children = new LinkedList<TreeNode>();
    while (nodes.size() > 0) {
      TreeNode node = nodes.poll();
      cur.add(node.val);
      if (node.left != null) {
        children.add(node.left);
      }
      if (node.right != null) {
        children.add(node.right);
      }
    }
    result.add(cur);
    helper(result, children);
  }
}
