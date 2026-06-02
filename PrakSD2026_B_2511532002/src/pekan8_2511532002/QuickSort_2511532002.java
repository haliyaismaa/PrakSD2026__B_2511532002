package pekan8_2511532002;

public class QuickSort_2511532002 {
	static void swap_2002 (int[] arr_2002, int i_2002, int j_2002) {
		int temp_2002=arr_2002[i_2002];
		arr_2002[i_2002]=arr_2002[j_2002];
		arr_2002[j_2002]=temp_2002;
		
	}
	//Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	static void medianOfThree_2002 (int[] arr_2002, int low_2002, int high_2002) {
		int  mid_2002=low_2002+(high_2002-low_2002)/2;
		
		//urutan elemen low, mid, dan high
		if (arr_2002[low_2002]>arr_2002[mid_2002]) {
			swap_2002(arr_2002, low_2002, mid_2002);
		}
		if (arr_2002[low_2002]> arr_2002[high_2002]) {
			swap_2002(arr_2002, low_2002, high_2002);
		}
		if (arr_2002[mid_2002]> arr_2002[high_2002]) {
			swap_2002(arr_2002, mid_2002, high_2002);
			swap_2002 (arr_2002, mid_2002, high_2002);
		}
	}
		static int partition(int[] arr_2002, int low_2002, int high_2002) {
			//panggil fungi medianOfThree sebelum menentukan pivot
			medianOfThree_2002(arr_2002, low_2002, high_2002);
			
			int pivot_2002=arr_2002[high_2002];
			int i_2002 = (low_2002 -1);
			
			for (int j_2002 =low_2002; j_2002 <= high_2002 - 1; j_2002++) {
				//Jika elemen saat ini lebih kecil dari  atau sama dengan pivot
				if (arr_2002[j_2002]<pivot_2002) {
					//increment  indeks elemen yang lebih kecil
					i_2002++;
					swap_2002(arr_2002, i_2002, j_2002);
				}
			}
			swap_2002(arr_2002, i_2002+1, high_2002);
			return (i_2002+1);
		}
		static void quickSort_2002(int[] arr_2002, int low_2002, int high_2002) {
			if (low_2002<high_2002) {
				int pi_2002=partition(arr_2002, low_2002, high_2002);

				quickSort_2002(arr_2002, low_2002, pi_2002-1);
				quickSort_2002(arr_2002, pi_2002+1, high_2002);
			}
		}

		public static void printArr_2002(int[] arr_2002) {
			for (int i_2002=0; i_2002<arr_2002.length; i_2002++) {
				System.out.print(arr_2002[i_2002]+" ");
			}

			System.out.println();
		}
	public static void main(String[] args) {
		int[] arr_2002 = {10, 7, 8, 9, 1, 5};
		int n_2002 =arr_2002.length;
		System.out.print("Data sebelum diurutkan: ");
		printArr_2002(arr_2002);
		
		quickSort_2002(arr_2002, 0, n_2002 - 1);
		
		System.out.print("Data Terurut  QuickSort: ");
		printArr_2002(arr_2002);
	}
	}