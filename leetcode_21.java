/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode result;
    if (l1 == null || l2 == null) {
      if (l1 == null) {
        return l2;
      }
      else {
        return l1;
      }
    }
    if (l1.val <= l2.val) {
      result = new ListNode(l1.val);
      l1 = l1.next;
    }
    else {
      result = new ListNode(l2.val);
      l2 = l2.next;
    }
    ListNode tempNode = result;
    while (l1 != null && l2 != null) {
      if (l1.val <= l2.val) {
        tempNode.next = new ListNode(l1.val);
        tempNode = tempNode.next;
        l1 = l1.next;
      }
      else {
        tempNode.next = new ListNode(l2.val);
        tempNode = tempNode.next;
        l2 = l2.next;
      }
    }
    if (l1 != null) {
      tempNode.next = l1;
    }
    else if (l2 != null) {
      tempNode.next = l2;
    }
    return result;
  }
}
