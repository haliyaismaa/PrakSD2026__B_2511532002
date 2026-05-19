package pekan7_2511532002;

public class BubleSort_2511532002 {
	public static void BubleSort_2511532002(int[] arr) {
		int n_2002=arr.length;
		for (int i_2002=0; i_2002 <n_2002; i_2002++) {
			for (int j_2002=0; j_2002<n_2002 - i_2002-1; j_2002++) {
				if (arr[j_2002]>arr[j_2002+1]) {
					int temp_2002=arr[j_2002];
					arr[j_2002]=arr[j_2002+1];
					arr[j_2002+1]=temp_2002;
					System.out.println("data: "+arr[j_2002]+" "+arr[j_2002+1]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr_2002[]= {23, 78, 45, 8, 32, 56, 1};
		int n_2002 = arr_2002.length;
		System.out.println("array yang belum terurut:\n");
		for (int i_2002=0; i_2002<n_2002;i_2002++)
			System.out.print(arr_2002[i_2002]+" ");
		System.out.println("");
		BubleSort_2511532002(arr_2002);
		System.out.println("array yang terurut:\n");
		for (int i_2002=0; i_2002<n_2002; i_2002++)
			System.out.print(arr_2002[i_2002]+" ");
		System.out.println("");
	}
}