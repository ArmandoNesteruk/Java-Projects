package simplelist;

/**
 * The <code>LinkedList</code> class implements a simple linked list based on
 * the specification of the abstract data type List. This implementation uses a
 * pointer implementation and not an array
 * 
 * Note that the position is implemented as an integer index This implementation
 * has disadvantages in regard to Big O(n) runtime
 * 
 */

public class LinkedList<E> implements List<E> {

	private ListNode<E> header;

	/**
	 * Construct the list
	 */
	public LinkedList() {
		header = new ListNode<E>(null);
	}

	/**
	 * Test if the list is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return header.next == null;
	}

	/**
	 * Appends the element x at the end of the list
	 *
	 * @param x
	 *            the item to append.
	 */
	public void append(E x) {

		ListNode<E> itr = header;
		while (itr.next != null)
			itr = itr.next;
		itr.next = new ListNode<E>(x);
	}

	/**
	 * Search for a specific object with the "same value"
	 * 
	 * @param x
	 *            the item to search for.
	 * @return the position of the item or -1 if the item is not found.
	 */
	public boolean contains(E x) {
		/* 1 */
		ListNode<E> itr = header.next;

		/* 2 */
		while (itr != null) {
			if (itr.element.equals(x))
				return true;
			else
				itr = itr.next;
		}

		return false;
	}

	/**
	 * toString
	 */
	public String toString() {
		StringBuffer sb = new StringBuffer();
		if (isEmpty())
			return null;
		else {
			ListNode<E> itr = header.next;

			sb.append("[");

			for (; itr != null; itr = itr.next) {
				sb.append(itr.element);
				if (itr.next != null)
					sb.append(",");

			}
		}

		sb.append("]");
		return sb.toString();
	}

}
