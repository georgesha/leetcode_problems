class Solution {
  public int[] twoSum(int[] numbers, int target) {
    if (numbers.length < 2) {
      return null;
    }
    int i = 0;
    int j = numbers.length - 1;
    while(i < j) {
      int cur = numbers[i] + numbers[j];
      if(cur == target) {
        break;
      }
      else if(cur > target){
        j--;
      }
      else{
        i++;
      }
    }
    return new int[]{i + 1, j + 1};
  }
}
