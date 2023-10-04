public class reverseList2{
	public static ListNode reverseList(ListNode head){
		//curr, next, prev -> return prev(flips the linkedlist)
		if(head == null){
			return null;
		}
		ListNode current = head;
		ListNode next = null;
		ListNode prev = null;
		while(current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}
}