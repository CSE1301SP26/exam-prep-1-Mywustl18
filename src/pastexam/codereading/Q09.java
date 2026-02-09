package pastexam.codereading;

public class Q09 {

	/*
	 * Get out a piece of paper! Predict the output 
	 * and write down your answers. You can then run
	 * the code to check the answer.
	 * 
	 * Not what you expected? Use the debugger or ask
	 * a TA to go through it with you!
	 */
	public static void main(String[] args) {
		int i = 11;
		int j = 14;
		while(i > 1 || j < 19) {
			System.out.println(i + " " + j);
			i = (i + 1) % 4;
			j = j + 2;
		}
	}
}
/*
i	j	print
11	14	11 14
0	16	0 16
1	18	1 18
2	20	2 20
3	22	3 22
0	24	

*/