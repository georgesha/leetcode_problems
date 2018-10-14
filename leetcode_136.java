class Solution {
    public int singleNumber(int[] nums) {
      ArrayList<Integer> al = new ArrayList<Integer>();
      for (int num:nums) {
        if (al.contains(num)) {
          al.remove(Integer.valueOf(num));
        }
        else {
          al.add(num);
        }
      }
      return al.get(0);
    }
}
