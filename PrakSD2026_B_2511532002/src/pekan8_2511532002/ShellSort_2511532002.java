package pekan8_2511532002;

public class ShellSort_2511532002 {
	public static void shellSort_2511532002 (int[] A_2002) {
		int n_2002= A_2002.length;
		int gap_2002=n_2002/2;
		while (gap_2002 >0) {
			for (int i_2002=gap_2002; i_2002<n_2002; i_2002++) {
				int temp_2002=A_2002[i_2002];
				int j_2002=i_2002;
				while (j_2002 >= gap_2002 && A_2002[j_2002-gap_2002]> temp_2002) {
					A_2002[j_2002]=A_2002[j_2002-gap_2002];
					j_2002=j_2002-gap_2002;
				}
				A_2002[j_2002]=temp_2002;
			}
			gap_2002=gap_2002/2;
				}
			}
	
	public static void main(String[] args) {
		int [] data_2002= {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		System.out.print("Sebelum: ");
		printArray_2002(data_2002);
		
		shellSort_2511532002(data_2002);
		
		System.out.print("Sesudah  (ShellSort): ");
		printArray_2002(data_2002);
	}
	
	public static void printArray_2002(int[] arr) {
		for (int i_2002:arr) System.out.print(i_2002 + " ");
		System.out.println();
		
	}

}
