/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode reverseList(ListNode head) {
    if(head == null) {
      return null;
    }
    ListNode pre = null;
    ListNode cur = head;
    while(cur != null) {
      ListNode tmp = cur.next;
      cur.next = pre;
      pre = cur;
      cur = tmp;
    }
    return pre;
  }
}
