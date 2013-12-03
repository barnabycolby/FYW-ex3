package ex3;

/**
 * Sequence starts at one and carries on by doubling the previously returned integer
 * @author Barnaby
 *
 */
public class Ex3GeometricIntSequence implements Ex3IntSequence{
	private int first;
	private int next;
	
	/**
	 * Constructor
	 * 
	 * Initialises the first and next internal variables
	 */
	public Ex3GeometricIntSequence(){
		this.first = 1;
		this.next = 2 * this.first;
	}
	
	/**
	 * firstInt
	 * @return Returns the first integer in the sequence
	 */
	public int firstInt(){
		this.next = this.first * 2;
		return this.first;
	}
	
	/**
	 * nextInt
	 * @return Returns the previous integer that was returned by the class multiplied by 2
	 */
	public int nextInt(){
		int temp = this.next;
		this.next *= 2;
		return temp;
	}
}
