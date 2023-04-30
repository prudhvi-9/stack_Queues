package stackQueues;

public class PeakPop {
	private Node top;
	private int count;

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
		count++;
	}
	/**
	 * To delete element from the top of the stack.
	 * @return-retiurns top.data.
	 */
	public int pop() {
		if (isEmpty()) {
		}

		int result = top.data;
		top = top.next;
		count--;
		return result;
	}
	/**
	 * To read the element present at the top of the stack.
	 * @return-returns top.data.
	 */
	public int peek() {
		if (isEmpty()) {
		}
		return top.data;
	}
	/**
	 * To find the size of the stack.
	 * @return- returns count.
	 */
	public int size() {
		return count;
	}
	/**
	 * To check the stack is empty or not.
	 * @return-count is zero.
	 */
	public boolean isEmpty() {
		return count == 0;
	}
	/**
	 * This used to print the element in the list.
	 *
	 */
	public void displayStack() {
		Node current = top;

		while (current != null) {
			System.out.print(current.data + "-> ");

			current = current.next;
		}
	}
}