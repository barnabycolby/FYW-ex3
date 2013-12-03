package ex3;

/**
 * An abstract class that simplifies implementing integer sequences by making use of an index into the sequence
 * @author Barnaby
 *
 */
public abstract class Ex3AbstractIntSequence implements Ex3IntSequence {
	private int prevIndex;
	private int firstIndex;
	
	/**
	 * Constructor
	 * @param first Identifies which index into the sequence firstInt should return
	 */
	public Ex3AbstractIntSequence(int first){
		this.firstIndex = first;
		this.prevIndex = first;
	}
	
	/**
	 * getIntByIndex
	 * 
	 * @param index The index into the sequence
	 * @return Return the index into the sequence as defined by the parameter index
	 */
	protected abstract int getIntByIndex(int index);
	
	/**
	 * firstInt
	 * 
	 * @return Returns the first integer in the sequence
	 */
	public int firstInt() {
		this.prevIndex = this.firstIndex;
		return getIntByIndex(this.firstIndex);
	}
	
	/**
	 * nextInt
	 * 
	 * @return Returns the next integer in the sequence after the previously returned integer
	 */
	public int nextInt() {
		this.prevIndex += 1;
		return getIntByIndex(this.prevIndex);
	}

}
