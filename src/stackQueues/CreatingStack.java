package stackQueues;

public class CreatingStack {
	/**
	 * This method is used to create a stack.
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * Creating a new CreateStack object .
		 */
		CreateStack stack = new CreateStack();

		stack.push(70);
		stack.push(30);
		stack.push(56);
		/**
		 * To print the list.
		 */
		stack.displayStack();

	}

}
