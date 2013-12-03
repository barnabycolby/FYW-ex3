package ex3;

/**
 * Describes classes that can provide a sequence of integers
 * @author Barnaby
 *
 */
public interface Ex3IntSequence {
	/**
	 * firstInt
	 * @return Returns the first integer of the sequence
	 */
	public int firstInt();
	
	/**
	 * nextInt
	 * @return Returns the next integer in the sequence after the most recently returned int
	 */
	public int nextInt();
}
