package stackQueues;

public class MainDequeue {
	/**
	 * This method is used to dequeue elements from a queue.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
	
		/**
		 * Creating a new Dequeue object .
		 */
		Dequeue<Integer> queue = new Dequeue<>();
		queue.enQueue(56);
		queue.enQueue(30);
		queue.enQueue(70);
		/**
		 * To print the list.
		 */
		queue.displayQueue();
		System.out.println();
		System.out.println("------------------------");
		
		System.out.println("Element Dequeued :" + queue.deQueue());
		System.out.println("------------------------");
		queue.displayQueue();
		System.out.println();
		System.out.println("------------------------");
		
		System.out.println("Element Dequeued :" + queue.deQueue());
		System.out.println("------------------------");
		queue.displayQueue();
		System.out.println();
		System.out.println("------------------------");
	}

}
