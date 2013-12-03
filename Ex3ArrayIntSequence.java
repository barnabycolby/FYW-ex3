package ex3;

/**
 * A class that extends Ex3AbstractIntSequence by making use of an array to store the sequence
 * @author Barnaby
 *
 */
public class Ex3ArrayIntSequence extends Ex3AbstractIntSequence {
	private int[] array;
	
	/**
	 * Constructor
	 * 
	 * @param intArray The array that contains the sequence of integers
	 */
	public Ex3ArrayIntSequence(int[] intArray) {
		super(0);
		this.array = intArray;
	}

	/**
	 * getIntByIndex
	 * 
	 * @param index The index into the sequence
	 * @return Returns the specified index of the array
	 */
	protected int getIntByIndex(int index) {
		return this.array[index];
	}

}
