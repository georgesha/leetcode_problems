class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
      }
      for (int i = 0; i < nums.length; i++) {
        int subtract = target - nums[i];
        if (map.get(subtract) != null && map.get(subtract) != i) {
          return new int[] {i, map.get(subtract)};
        }
      }
      return null;
    }
}
