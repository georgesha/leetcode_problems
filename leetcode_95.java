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
  public List<TreeNode> generateTrees(int n) {
    if (n <= 0) {
      return new ArrayList<TreeNode>();
    }
    return buildTrees(1, n);
  }

  private List<TreeNode> buildTrees(int start, int end) {
    List<TreeNode> nodeList = new ArrayList<TreeNode>();

    if (start > end) {
      nodeList.add(null);
      return nodeList;
    }

    if (start == end) {
      nodeList.add(new TreeNode(start));
      return nodeList;
    }

    for (int i = start; i <= end; i++) {
      List<TreeNode> left = buildTrees(start, i - 1);
      List<TreeNode> right = buildTrees(i + 1, end);

      for (TreeNode l:left) {
        for (TreeNode r:right) {
          TreeNode root = new TreeNode(i);
          root.left = l;
          root.right = r;
          nodeList.add(root);
        }
      }
    }
    return nodeList;
  }
}
