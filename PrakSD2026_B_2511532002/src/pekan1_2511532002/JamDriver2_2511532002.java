package pekan1_2511532002;

import java.util.Scanner;

public class JamDriver2_2511532002 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("=== Program Driver Objek Jam ===");
		
		//1. Input Jam Pertama
		System.out.println("\n --- Input Jam 1 ---");
		jam_2511532002 j1 = buatJamDariInput (input);
		
		//2. Input Jam Kedua
		System.out.println("\n --- Input Jam 2 ---");
		jam_2511532002 j2 = buatJamDariInput (input);
		
		// 3. Menampilkan Data
		System.out.println("\n ---  Hasil Operasi ");
		System.out.println(" Jam 1 (String)        : " +j1.toString());
		System.out.println(" Jam 2 (String)        : " +j2.toString());
		System.out.println(" Jam 1 dalam detik     : " + j1.toSecond());
		System.out.println(" Jam 2 dalam detik     : " + j2.toSecond());
		
		//4.  Operasi Relational  (Perbandingan)
		int perbandingan = j1.compareTo (j2);
		if (perbandingan > 0) {
			System.out.println("Status       : Jam 1 lebih lambat (setelah) Jam 2");
		}else if (perbandingan < 0) {
			System.out.println("Status       : Jam 1 ebih awal (sebelum) Jam 2");
		}else {
			System.out.println("Status       : Jam 1  dan Jam 2 sama  persis");
		}
		
		//5.  Operasi Aritmatika 
		System.out.println(" Durasi  (J1 ke J2)    : " +jam_2511532002.durasiDetik(j1, j2)+ " detik");
		
		jam_2511532002 jNext = j1.nextSecond();
		System.out.println("Jam 1 Detik Berikutnya : "+ jNext);
		
		jam_2511532002 jPrev= j1.prevSecond();
		System.out.println("Jam 1 Detik Sebelumnya : "+ jPrev);

		//6. Operasi  Penjujmlahan Jam
		jam_2511532002 jHasilPlus = j1.plus(j2);
		System.out.println("Hasil J1 + J2          : "+ jHasilPlus);
		
		input.close();
		System.out.println("\n Program Selesai.");
	}
	/**
	 *  Prosedur pembantu untuk melakukan inbput dan validasi secara berulang
	 *  sampai user memasukan angka yang benar (0..23, 0..59).
	 */
	
	private static jam_2511532002 buatJamDariInput  (Scanner sc) {
		int h,m,s;
		while (true) {
			System.out.println("Masukan Jam (0-23)   : ");
			h=sc.nextInt();
			System.out.println("Masukan Menit (0-59) : ");
			m=sc.nextInt();
			System.out.println("Masukan Detik (0-59) : ");
			s=sc.nextInt();
			
			//Memanggil  methode static isValid  dari kelas jam_2511532002
			if (jam_2511532002.isValid(h, m, s)) {
				return new jam_2511532002(h,m,s);
			}else {
				System.out.println("[ERROR] Input tidak valid! Silahkan Ulangi.\n");
			}
		}


	}

}
