package pekan7_2511532002;

public class SelectionSort_2511532002 {
	public static void SelectionSort_2511532002(int[]arr_2002) {
		int n_2002 = arr_2002.length;
		for (int i_2002 =0; i_2002<n_2002; i_2002++) {
			int minIndex_2002=1;
			for (int j=i_2002+1; j<n_2002; j++) {
				if (arr_2002[j] < arr_2002[minIndex_2002]) {
					minIndex_2002=j;
				}
			}
			int temp_2002=arr_2002[i_2002];
			arr_2002[i_2002]=arr_2002[minIndex_2002];
			arr_2002[minIndex_2002]=temp_2002;
		}
	}

	public static void main(String[] args) {
		int arr_2002[]= {23, 78, 45, 8, 32, 56, 1};
		int n_2002 = arr_2002.length;
		System.out.println("array yang belum terurut:\n");
		for (int i_2002i=0; i_2002i<n_2002;i_2002i++)
			System.out.print(arr_2002[i_2002i]+" ");
		System.out.println("");
		SelectionSort_2511532002(arr_2002);
		System.out.println("array yang terurut:\n");
		for (int i_2002=0; i_2002<n_2002; i_2002++)
			System.out.print(arr_2002[i_2002]+" ");
		System.out.println("");
	}
}
