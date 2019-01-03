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
  public int sumNumbers(TreeNode root) {
    if (root == null) {
      return 0;
    }
    List<Integer> nums = new ArrayList<Integer>();
    helper(root, nums, "");
    int result = 0;
    for (int num : nums) {
      result += num;
    }
    return result;
  }
  private void helper(TreeNode node, List<Integer> nums, String cur) {
    if (node == null) {
      return;
    }
    cur = cur + Integer.toString(node.val);
    if (node.left == null && node.right == null) {
      nums.add(Integer.parseInt(cur));
    }
    helper(node.left, nums, cur);
    helper(node.right, nums, cur);
  }
}
