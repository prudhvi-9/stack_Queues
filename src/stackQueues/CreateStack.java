package stackQueues;

public class CreateStack {
	private Node top;

	private class Node {
		/**
		 * Data to be inserted.
		 */
		private int data;
		/**
		 * Refercence Variable
		 */
		private Node next;

		/**
		 * Constructor
		 *
		 */
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	/**
	 * Create a New node. Assign new Node(data) to new node tempNode. 
	 * tempNode next wil be in the top of the stack. 
	 * And top contains the new node that is tempNode.
	 * 
	 */
	public void push(int data) {
		/**
		 * new Node is created.
		 */
		Node tempNode = new Node(data);
		tempNode.next = top;
		top = tempNode;
	}

	/**
	 * This used to print the element in the list.
	 * 
	 * @param head-head of the linkedlist
	 */
	public void displayStack() {
		Node current = top;

		while (current != null) {
			System.out.print(current.data + "-> ");

			current = current.next;
		}
	}
}
