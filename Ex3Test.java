package ex3;

public class Ex3Test {
	/**
	 * Prints the first five elements in a sequence
	 * @param sequence An Ex3IntSequence class which defines the sequence of integers
	 */
	public static void printFirstFiveElements(Ex3IntSequence sequence){
		System.out.println(sequence.firstInt());
		for(int i = 0; i < 4; i++){
			System.out.println(sequence.nextInt());
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Ex3GeometricIntSequence geometric = new Ex3GeometricIntSequence();
		Ex3ArithmeticIntSequence arithmetic = new Ex3ArithmeticIntSequence();
		
		//Fibonacci sequence
		int[] sequence = {1,2,3,5,8,13,21};
		Ex3ArrayIntSequence array = new Ex3ArrayIntSequence(sequence);
		
		printFirstFiveElements(geometric);
		System.out.println();
		printFirstFiveElements(arithmetic);
		System.out.println();
		printFirstFiveElements(array);

	}

}
