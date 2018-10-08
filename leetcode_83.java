/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
      if (head == null)  {
        return null;
      }
      ListNode cur = head;
      while (cur != null && cur.next != null) {
        if (cur.val == cur.next.val) {
          cur.next = cur.next.next;
        }
        if (cur.next != null && cur.val == cur.next.val) {
          continue;
        }
        cur = cur.next;
      }
      return head;
    }
}
