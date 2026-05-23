package simplelist;

// Basic node stored in a linked list
// Note that this class is not accessible outside

public class ListNode<E> {

	protected E element;
	protected ListNode<E> next;

	// Constructors
	public ListNode(E theElement) {
		element = theElement;
		next = null;

	}

}
