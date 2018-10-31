/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return head;
    }
    ListNode pre = null;
    ListNode cur = head;
    while(cur != null) {
      if(cur.val == val) {
        if(pre != null) {
          pre.next = cur.next;
          cur = pre.next;
        }
        else {
        head = head.next;
        cur = head;
        }
      }
      else {
        pre = cur;
        cur = cur.next;
      }
    }
    return head;
  }
}
