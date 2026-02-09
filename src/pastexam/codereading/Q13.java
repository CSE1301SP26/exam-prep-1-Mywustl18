package pastexam.codereading;

public class Q13 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			if(i / 2 == 0 || i/2 == 1) {
				System.out.println(i);
			}
		}
	}
}
/*
i i/2
0 0
1 0
2 1
3 1
4 2

printed out 0, 1, 2, 3
*/