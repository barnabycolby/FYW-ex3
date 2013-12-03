package ex3;

public class Ex3ArithmeticIntSequence extends Ex3AbstractIntSequence {
	/**
	 * Constructor
	 * 
	 * Calls the constructor of the superclass indicating that firstInt should return the integer at index 0
	 */
	public Ex3ArithmeticIntSequence() {
		super(0);
	}
	
	/**
	 * getIntByIndex
	 * 
	 * @param index The index into the sequence
	 * @returns Returns the index plus one
	 */
	protected int getIntByIndex(int index) {
		return (index+1);
	}
}
