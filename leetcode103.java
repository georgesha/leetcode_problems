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
  public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>> result = new ArrayList<List<Integer>>();
    if (root == null) {
      return result;
    }
    Queue<TreeNode> nodes = new LinkedList<TreeNode>();
    nodes.add(root);
    int size = 1;
    ArrayList<Integer> level = new ArrayList<Integer>();
    boolean zigzag = false;
    while (nodes.size() > 0) {
      while (size > 0) {
        TreeNode cur = nodes.poll();
        if (zigzag) {
          level.add(0, cur.val);
        }
        else {
          level.add(cur.val);
        }
        if (cur.left != null) {
          nodes.add(cur.left);
        }
        if (cur.right != null) {
          nodes.add(cur.right);
        }
        size--;
      }
      zigzag = !zigzag;
      size = nodes.size();
      result.add(level);
      level = new ArrayList<Integer>();
    }
    return result;
  }
}
