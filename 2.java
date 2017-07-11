/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
	if(l2 == null) return l1;

	ListNode result = l1;
	l1.val += l2.val;
	
	while(l1.next != null && l2.next != null) {
		if(l1.val > 9) {
			l1.val %= 10;
			l1.next.val += 1;
		} 
		l1.next.val += l2.next.val;
		
		l1 = l1.next;
		l2 = l2.next;
	}

	if(l2.next != null){
		l1.next = l2.next;
	} 
	
	while(l1.val > 9) {
		l1.val %= 10;
		if(l1.next == null) {
			l1.next = new ListNode(1);
		} else {
			l1.next.val++;
			l1 = l1.next;
		}
	}

	return result;
    }
}
