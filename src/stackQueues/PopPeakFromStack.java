package stackQueues;

public class PopPeakFromStack {
	/**
	 * This method is used to peek and pop elements from  a stack.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Creating a new PeakPop object .
		 */
		PeakPop stack = new PeakPop();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		System.out.println("Stack:");
		stack.displayStack();
		System.out.println();
		
		System.out.println("peeking :");
		System.out.println(stack.peek());
		System.out.println("poping top element:");
		System.out.println(stack.pop());
		System.out.println("After poping:");
		stack.displayStack();
		
		System.out.println();
		System.out.println("peeking :");
		System.out.println(stack.peek());
		System.out.println("poping top element:");
		System.out.println(stack.pop());
		System.out.println("After poping:");
		stack.displayStack();
		

		
	}
}