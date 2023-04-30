package stackQueues;

public class CreateQueue<T> {
	private Node<T> front;
	private Node<T> rear;

	private static class Node<T> {
		/**
		 * Data to be inserted.
		 */
		private T data;
		/**
		 * Refercence Variable
		 */
		private Node<T> next;

		/**
		 * Constructor
		 *
		 */
		public Node(T data) {
			this.data = data;
		}
	}

	/**
	 *  To insert an data in Queue(rear).
	 * 
	 * @param -element to be inserted in the Queue
	 */
	public void enQueue(T element) {
		if (front == null) {
			rear = new Node<T>(element);
			front = rear;
		} else {
			rear.next = new Node<T>(element);
			rear = rear.next;
		}

	}
	/**
	 * To print the element in the queue.
	 *
	 */
	public void displayQueue() {
		Node<T> currentNode = front;
		while (currentNode != null) {
			System.out.print(currentNode.data + "-> ");
			currentNode = currentNode.next;
		}
	}
}
