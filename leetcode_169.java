class Solution {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> appearance = new HashMap<Integer, Integer>();
    for(int num:nums) {
      if (appearance.get(num) == null) {
        appearance.put(num, 1);
      }
      else {
        appearance.put(num, appearance.get(num) + 1);
      }
    }
    int majority = 0;
    for (Map.Entry<Integer, Integer> entry : appearance.entrySet()) {
      if (entry.getValue() > nums.length / 2) {
        majority = entry.getKey();
      }
    }
    return majority;
  }
}
