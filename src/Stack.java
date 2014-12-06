/** @author Stephen */
import java.util.Scanner;

/**
 * Stacks allow only a single item to be added (Push) or (Pop) removed at a time
 * Stacks allow access to the last item added (LIFO)
 */
public class Stack {

	/* Data fields */
	// Array of integers
	private int[] stackArray;
	// Set top of Stack to 0
	private int topOfStack = 0;

	/* Constructor */
	// Pass in var size to new Stack Array
	public Stack(int size) {
		this.stackArray = new int[size];
	}

	/* Push */
	// Pass in value to be added new Stack Array
	public void push(int value) {
		if (isFull()) {
			System.out.println("Push:" + value + "-Nope, Stack Full!");
		} else {
			// add item to top of stack
			this.stackArray[topOfStack] = value;
			// increment Stack
			topOfStack++;
			// Confirm push
			System.out.print("Push:" + value + "-Yep. ");
		}
	}

	/* Pop */
	public int pop() {
		// If pop and stack is empty
		if (isEmpty()) {
			System.out.println("No Pop - Stack Empty!");

		} else {
			// Pop (remove) item from Stack
			topOfStack = topOfStack - 1;
			System.out.println("Pop:" + stackArray[topOfStack]);
			return stackArray[topOfStack];

		}
		return topOfStack;
	}

	/* isEmpty */
	// Check to see if Stack is Empty
	public boolean isEmpty() {
		if (topOfStack == 0) {
			return true;
		} else {
			return false;
		}
	}

	// isFull
	// Check to see if Stack is Full
	public boolean isFull() {
		if (topOfStack == this.stackArray.length) {
			return true;
		} else {
			return false;
		}
	}

	// Check what is at the top of the stack
	public int peek() {
		System.out.print("Top:[" + stackArray[topOfStack - 1] + "] ");
		return topOfStack;
	}

	// Print stack contents
	public void print() {
		System.out.print("Stack contents: ");

		for (int i = 0; i < topOfStack; i++) {
			System.out.print("[" + this.stackArray[i] + "]");

		}
		System.out.print("\n");
		// print Min or Max
		System.out.println("\nType *Min* to Print Minimum");
		System.out.println("Type *Max* to Print Maximum");

		Scanner printInput = new Scanner(System.in);
		String next = printInput.nextLine();
		
		if (next.equalsIgnoreCase("min")) {
			
			System.out.println("This is the Min :" + getMinValue(stackArray));
			
		}
		
		if (next.equalsIgnoreCase("max")) {
			System.out.println("This is the Max :" + getMaxValue(stackArray));
			
			
		}
	}

	// getting the miniumum value
	public static int getMaxValue(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];

			}
		}
		return maxValue;
	}

	// getting the miniumum value
	public static int getMinValue(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	// *****************OPERATIONS*****************************
	// void push( x ) --> Add x
	// pop( ) --> Remove last item added
	// boolean isEmpty( ) --> Return true if empty; else false
	// boolean isFull( ) --> Return true if full; else false
	// peek --> Peek at top of Stack
	// ******************ERRORS********************************
	// 1. Pop on empty stack - OUTPUT: Stack Empty!
	// 2. Push on full stack - OUTPUT: Nope, Stack Full!

	public static void main(String[] args) {
		Stack s = new Stack(5);
		s.pop(); // Pop an Empty stack. OUTPUT: Stack Empty!
		s.push(1); // Push 1
		s.push(2); // Push 2
		s.push(3); // Push 3
		s.peek(); // Peek at top of Stack. OUTPUT: Top:[3]
		s.push(4); // Push 4
		s.push(5); // Push 5
		s.pop(); // Pop 5
		s.push(6); // Push 6
		s.pop(); // Pop 6
		s.push(7); // Pop 7
		s.push(8); // Pop 8 Nope, Stack Full!
		s.print();
		System.out.println("Stack size: " + s.topOfStack);
		s.peek(); // Peek at top of Stack. OUTPUT: Top:[7]
		
		
	}
}
