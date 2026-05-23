package simplelist;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> theList = new LinkedList<String>();

		// Print initial list
		System.out.println("initial: " + theList.isEmpty());

		// Insert Strings "0" to "9" into the list
		for (int i = 0; i < 10; i++) {
			theList.append(new Integer(i).toString());
			System.out.println(theList);

		}

		System.out.println("contains hello: " 	+ theList.contains("hello"));
		System.out.println("contains 9: " 		+ theList.contains("9"));

	}
}
