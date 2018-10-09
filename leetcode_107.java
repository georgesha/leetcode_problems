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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
      LinkedList<List<Integer>> result_reverse = new LinkedList<List<Integer>>();
      if (root == null) {
        return result_reverse;
      }
      LinkedList<TreeNode> level = new LinkedList<TreeNode>();
      level.add(root);
      processLevel(result_reverse, level);
      LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
      while(result_reverse.size() > 0) {
        result.add(result_reverse.removeLast());
      }
      return result;
    }

    public void processLevel(LinkedList<List<Integer>> result_reverse, LinkedList<TreeNode> level) {
      ArrayList<Integer> cur = new ArrayList<Integer>();
      LinkedList<TreeNode> nextLevel = new LinkedList<TreeNode>();
      while(level.size() > 0) {
        TreeNode node = level.removeFirst();
        if (node != null) {
          cur.add(node.val);
          nextLevel.add(node.left);
          nextLevel.add(node.right);
        }
      }
      if (nextLevel.size() == 0) {
        return;
      }
      result_reverse.add(cur);
      processLevel(result_reverse, nextLevel);
    }
}
