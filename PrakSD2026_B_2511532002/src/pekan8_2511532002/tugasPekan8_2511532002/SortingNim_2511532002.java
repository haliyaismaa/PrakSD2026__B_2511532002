package tugasPekan8_2511532002;

import java.util.Scanner;

public class SortingNim_2511532002 {
	Lagu_2511532002[] dataLagu_2002=new Lagu_2511532002[20];
	int jumlahData_2002;
	
	//Methode inputData
	void input_2002() {
		dataLagu_2002[0]=new Lagu_2511532002("Sparks", "Coldplay", 263);
		dataLagu_2002[1]=new Lagu_2511532002("Bonefire", "Wave to earth", 222);
		dataLagu_2002[2]=new Lagu_2511532002("My Love Mine All Mine", "Mitski", 230);
		dataLagu_2002[3]=new Lagu_2511532002("Iris", "The Goo Goo Dolls", 175);
		dataLagu_2002[4]=new Lagu_2511532002("Always", "Daniel Caesar", 270);
		dataLagu_2002[5]=new Lagu_2511532002("Thank You", "Dido", 199);
		dataLagu_2002[6]=new Lagu_2511532002("I Love You, I'm Sorry", "Gracie Abrams", 225);


		jumlahData_2002=7;
	}
	
	//Methode ShellSort
	void shellSort_2002() {
		for (int gap_2002=jumlahData_2002/2;
				gap_2002 >0;
				gap_2002 /=2) {
			
			//Melakukan proses insertion sort berdasarkan gap
			for (int i_2002=gap_2002;
					i_2002 < jumlahData_2002;
					i_2002++) {
				
				Lagu_2511532002 temp_2002 = dataLagu_2002[i_2002];
				int j_2002;
				
				//Membandingkan judul Lagu secara Alfabetics
				for (j_2002=i_2002;
					j_2002 >= gap_2002 && dataLagu_2002[j_2002-gap_2002].judul_2002.compareToIgnoreCase(temp_2002.judul_2002)>0;
						j_2002 -=gap_2002) {
					
					dataLagu_2002[j_2002]=dataLagu_2002[j_2002-gap_2002];
				}
				
				dataLagu_2002[j_2002]=temp_2002;
			}
		}
	}
	
	//Methode QuickSort
	int partition_2002(int low_2002, int high_2002) {

	    int pivot_2002 =
	            dataLagu_2002[high_2002].durasi_2002;

	    int i_2002 = low_2002 - 1;

	    for (int j_2002 = low_2002;
	            j_2002 < high_2002;
	            j_2002++) {

	        if (dataLagu_2002[j_2002].durasi_2002 < pivot_2002) {

	            i_2002++;

	            Lagu_2511532002 temp_2002 =
	                    dataLagu_2002[i_2002];
	            dataLagu_2002[i_2002] =
	                    dataLagu_2002[j_2002];
	            dataLagu_2002[j_2002] = temp_2002;
	        }
	    }

	    Lagu_2511532002 temp_2002 =
	            dataLagu_2002[i_2002 + 1];
	    dataLagu_2002[i_2002 + 1] =
	            dataLagu_2002[high_2002];
	    dataLagu_2002[high_2002] = temp_2002;

	    return i_2002 + 1;
	}

	void quickSort_2002(int low_2002, int high_2002) {

		if (low_2002 < high_2002) {

			int pi_2002 =
					partition_2002(low_2002, high_2002);

			quickSort_2002(low_2002, pi_2002 - 1);
			quickSort_2002(pi_2002 + 1, high_2002);
		}
	}
	
	//Methode Merge Sort
	void merge_2002(int l_2002,
			int m_2002,
			int r_2002) {

		int n1_2002 = m_2002 - l_2002 + 1;
		int n2_2002 = r_2002 - m_2002;

		Lagu_2511532002[] L_2002 = new Lagu_2511532002[n1_2002];
		Lagu_2511532002[] R_2002 = new Lagu_2511532002[n2_2002];

		for (int i_2002 = 0; i_2002 < n1_2002; i_2002++)
			L_2002[i_2002] = dataLagu_2002[l_2002 + i_2002];

		for (int j_2002 = 0; j_2002 < n2_2002; j_2002++)
			R_2002[j_2002] = dataLagu_2002[m_2002 + 1 + j_2002];

		int i_2002 = 0;
		int j_2002 = 0;
		int k_2002 = l_2002;

		while (i_2002 < n1_2002 && j_2002 < n2_2002) {

			if (L_2002[i_2002].judul_2002.compareToIgnoreCase(
					R_2002[j_2002].judul_2002) <= 0) {
			
				dataLagu_2002[k_2002] = L_2002[i_2002];
				i_2002++;
				} else {

		dataLagu_2002[k_2002] = R_2002[j_2002];
		j_2002++;
		}
			k_2002++;
			}

		while (i_2002 < n1_2002) {
			dataLagu_2002[k_2002] = L_2002[i_2002];
			i_2002++;
			k_2002++;
		}

		while (j_2002 < n2_2002) {
			dataLagu_2002[k_2002] = R_2002[j_2002];
			j_2002++;
			k_2002++;
		}
	}

	void mergeSort_2002(int l_2002, int r_2002) {

		if (l_2002 < r_2002) {

			int m_2002 = (l_2002 + r_2002) / 2;

			mergeSort_2002(l_2002, m_2002);
			mergeSort_2002(m_2002 + 1, r_2002);

			merge_2002(l_2002, m_2002, r_2002);
		}
	}

	// Methode Tampilin data
	void tampil_2002() {
		for (int i_2002 =0;
				i_2002 <jumlahData_2002;
				i_2002++) {
			System.out.println(
					(i_2002+1)+". "+dataLagu_2002[i_2002].judul_2002+" - "+dataLagu_2002[i_2002].penyanyi_2002+" - "+dataLagu_2002[i_2002].durasi_2002+" detik");
		}
	}
	
//Main Program
	public static void main(String[] args) {

		Scanner input_2002 = new Scanner(System.in);

		SortingNim_2511532002 playlist_2002 =
				new SortingNim_2511532002();

		playlist_2002.input_2002();

		System.out.println("=== SORTING PLAYLIST NIM 2511532002 ===");
		System.out.println("1. Shell Sort");
		System.out.println("2. Quick Sort");
		System.out.println("3. Merge Sort");

		System.out.print("\nPilih Algoritma Sorting : ");
		int pilih_2002 = input_2002.nextInt();

		System.out.println("\n=== Data Sebelum Sorting ===");
		playlist_2002.tampil_2002();

		switch (pilih_2002) {

		case 1:
			playlist_2002.shellSort_2002();
			System.out.println("\n=== Data Setelah Shell Sort (A-Z) ===");
			break;

		case 2:
			playlist_2002.quickSort_2002(
					0,
					playlist_2002.jumlahData_2002 - 1);
			System.out.println("\n=== Data Setelah Quick Sort (Durasi) ===");
			break;

		case 3:
			playlist_2002.mergeSort_2002(
					0,
					playlist_2002.jumlahData_2002 - 1);
			System.out.println("\n=== Data Setelah Merge Sort (A-Z) ===");
			break;

		default:
			System.out.println("Pilihan tidak valid!");
			return;
		}

		playlist_2002.tampil_2002();
		input_2002.close();
	}
}