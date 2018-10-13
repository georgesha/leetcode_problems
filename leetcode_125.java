class Solution {
  public boolean isPalindrome(String s) {
		char[] arr = s.toCharArray();
		if (arr.length == 0) {
			return true;
		}
		LinkedList<Character> letters = new LinkedList<Character>();
		for (char val : arr) {
			if (Character.isLetterOrDigit(val)) {
				letters.add(Character.toLowerCase(val));
			}
		}
		while (letters.size() > 1) {
			if (letters.removeFirst() != letters.removeLast()) {
				return false;
			}
		}
		return true;
	}
}
