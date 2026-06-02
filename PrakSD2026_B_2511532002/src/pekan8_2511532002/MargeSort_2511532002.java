package pekan8_2511532002;

public class MargeSort_2511532002 {
	void merge_2002(int arr_2002[], int l_2002, int m_2002, int r_2002) {
		//Find  sizes of two subarrays to be merged
		int n1_2002=m_2002-l_2002+1;
		int n2_2002=r_2002-m_2002;
		
		/*Create temp arrays*/
		int L_2002[] = new int[n1_2002];
		int R_2002[]= new int [n2_2002];
		
		/* Copy data to temp arrays */
		for (int i_2002=0; i_2002 < n1_2002; ++i_2002)
			L_2002[i_2002]=arr_2002[l_2002+i_2002];
		for (int j_2002 =0; j_2002 <n2_2002; ++j_2002)
			R_2002[j_2002]=arr_2002[m_2002+1+j_2002];
		int i_2002=0, j_2002=0;
		
		//Initial inde of merged subarray array
		int k_2002=l_2002;
		while (i_2002 <n1_2002&&j_2002<n2_2002) {
			if (L_2002[i_2002] <= R_2002[j_2002]) {
				arr_2002 [k_2002] =L_2002[i_2002];
				i_2002++;
			}else {
				arr_2002[k_2002]=R_2002[j_2002];
				j_2002++;
			}
			k_2002++;
		}
		/*Copy remaining elements of L_2002[] if any */
		while (i_2002 <n1_2002) {
			arr_2002[k_2002]= L_2002[i_2002];
			i_2002++;
			k_2002++;
		}
		
		/*Copy remaining elements  of R_2002[] if any*/
		while (j_2002 < n2_2002) {
			arr_2002[k_2002]=R_2002[j_2002];
			j_2002++;
			k_2002++;
		}
		}
	void sort_2002 (int arr_2002[], int l_2002, int r_2002) {
		if (l_2002 <r_2002) {
			//Find the middle point 
			int m_2002 = (l_2002 +r_2002)/2;
			//Sort first
			sort_2002(arr_2002, l_2002, m_2002);
			sort_2002(arr_2002, m_2002 + 1, r_2002);

			// Merge the sorted halves
			merge_2002(arr_2002, l_2002, m_2002, r_2002);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int arr_2002[]) {
		int n_2002 = arr_2002.length;

		for (int i_2002 = 0; i_2002 < n_2002; ++i_2002)
			System.out.print(arr_2002[i_2002] + " ");

		System.out.println();
	}

	public static void main(String args_2002[]) {

		int arr_2002[] = {12, 11, 13, 5, 6, 7};

		System.out.println("Sebelum terurut: ");
		printArray(arr_2002);

		MargeSort_2511532002 ob_2002 = new MargeSort_2511532002();

		ob_2002.sort_2002(arr_2002, 0, arr_2002.length - 1);

		System.out.println("\nSesudah Terurut menggunakan Merge Sort: ");
		printArray(arr_2002);
	}
		}