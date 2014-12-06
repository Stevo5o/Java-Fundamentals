/** @author Stephen */


/*Queue.java,
 with enqueue, dequeue, isEmpty, isFull methods
 */
public class Queue {

	private int[] queueArray;
	int rear;
	int temp;
	private static int x;

	// Constructor to access queue array
	public Queue(int size, int x) {
		this.queueArray = new int[size];
		this.x = x;
	}

	// Boolean Check to see if the Queue is Empty
	public boolean isQueueEmpty() {
		// If the rear position is at 0
		if (rear == 0) {
			return true;
		} else {
			return false;
		}
	}

	// Boolean Check to see if the Queue is Full
	public boolean isQueueFull() {
		// If the rear position is at more than the length of the array
		if (rear == queueArray.length) {
			return true;
		} else {
			return false;
		}
	}

	public void insert(int input) {
		if (isQueueFull()) {
			System.out.print("\nNo Insert:" + input + " Queue is Full!");
		} else {
			System.out.print("Ins[" + input + "] ");
			// Try Catch Array Index Out Of Bounds Exception
			try {
				// Rear is assigned the input
				queueArray[rear] = input;

			} catch (ArrayIndexOutOfBoundsException e) {
				// Print Array Index Out Of Bounds Exception + input and rear
				// position
				System.out.println("\nArray Index Out Of Bounds Exception at "
						+ rear + " Ins[" + input + "]");

			}
			rear++;
		}
	}

	public int delete() {
		// If array is empty
		if (isQueueEmpty()) {
			System.out.print("\nUnderflow! ");

		} else {
			// Assign temporary variable array value
			int temp = queueArray[0];

			// Loop through array
			for (int index = 0; index < rear; index++) {

			}

			System.out.print("\nDelete ");

		}
		// delete last value in array
		rear--;
		System.out.print("Rear: " + rear + " ");
		return temp;

	}
	
	public void peek() {

		int frontNow = queueArray[rear];

		int rearNow = queueArray[rear - 1];
		int readPrint = rear -1;
		
		
		System.out.println();
		System.out.println("Front " + rear + " = " + frontNow);
		System.out.println("Rear " + readPrint + " = " + rearNow);

	}

	public void print() {
		System.out.print("\nContents: ");

		for (int index = 0; index < rear; index++) {
			System.out.print("Ind:" + index + "[" + this.queueArray[index] + "] ");

		}
	}

	public static void main(String[] args) {

		Queue Q = new Queue(4, x);
		//Q.delete(); // Delete Rear: 3
		Q.insert(10); // Insert Ins[10]
		Q.insert(15); // Ins[15]
		Q.insert(11); // Ins[11]
		Q.insert(25); // Ins[25]
		Q.insert(37); // No Insert:37 Queue is Full!
		Q.insert(18); // No Insert:18 Queue is Full!
		// Print Ins[10] Ins[15] Ins[11] Ins[25]
		Q.print(); // Contents: [10][15][11][25]
		Q.delete(); // Delete Rear: 3
		Q.delete(); // Delete Rear: 2
		Q.insert(28); // Ins[28]
		Q.insert(72); // Ins[72]
		Q.print(); // Contents: [10][15][28][72]
		Q.delete(); // Delete Rear: 3
		Q.delete(); // Delete Rear: 2
		Q.print(); // Contents: [10][15]
		Q.delete(); // Delete Rear: 1
		Q.delete(); // Delete Rear: 0
		Q.delete(); // Underflow! Rear: -1
		Q.delete(); // Delete Rear: -2
		Q.insert(19); // Ins[19] First: Array Index Out Of Bounds Exception
		Q.insert(91); // Ins[91] Second: Array Index Out Of Bounds Exception
		Q.insert(85); // Ins[85]
		Q.insert(86); // Ins[86]
		Q.insert(77); // Ins[77]
		Q.insert(66); // Ins[66]
		Q.print(); // Contents: [85][86][77][66]
	}

}