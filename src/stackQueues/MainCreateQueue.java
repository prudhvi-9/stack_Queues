package stackQueues;

public class MainCreateQueue {
	/**
	 * This method is used to create a queue.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Creating a new CreateQueue object .
		 */
		CreateQueue<Integer> queue = new CreateQueue<>();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		/**
		 * To print the list.
		 */
		queue.displayQueue();

	}
}
