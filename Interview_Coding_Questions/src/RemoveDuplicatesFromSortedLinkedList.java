class ListNode{
	int val;
	ListNode next;
	
	ListNode(int val)
	{
		this.val = val;
		this.next = null;
	}
}


public class RemoveDuplicatesFromSortedLinkedList {

	public ListNode deleteDuplicates(ListNode head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		ListNode current = head;
		
		while(current.next != null)
		{
			if(current.val == current.next.val)
			{
				//Skip duplicate node
				
				current.next = current.next.next;
			}
			
			else {
				//Move to next unique node
				
				current = current.next;
			}
		}
		
		return head;
	}
	
	public void printList(ListNode head)
	{
		ListNode temp = head;
		
		while(temp != null)
		{
			System.out.print(temp.val + " -> ");
			temp = temp.next;
		}
		
		System.out.println("null");
	}
	
	
	public static void main(String[] args)
	{
		ListNode head = new ListNode(1);
		
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next = new ListNode(3);
		head.next.next.next.next.next.next = new ListNode(4);
		
		System.out.println("Original List:- ");
		
		RemoveDuplicatesFromSortedLinkedList object1 = new RemoveDuplicatesFromSortedLinkedList();
		
		object1.printList(head);
		
		ListNode result = object1.deleteDuplicates(head);
		
		System.out.println("After removing duplicates:- ");
		
		object1.printList(head);
		
	}
	
}
