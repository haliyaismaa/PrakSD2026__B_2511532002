package tugasPekan6_2511532002;

import java.util.Scanner;

public class MainProgram_2511532002 {

	public static void main(String[] args) {
		Scanner input_2002 = new Scanner(System.in);
		Musik_2511532002 playlist_2002 = new Musik_2511532002();

		int pilihan_2002;

		
			System.out.println("\n=== Playlist Musik NIM: 2511532002 ===");
			System.out.println("1. Tambah Lagu");
			System.out.println("2. Hapus Lagu Pertama");
			System.out.println("3. Lihat Playlist (Maju)");
			System.out.println("4. Lihat Playlist (Mundur)");
			System.out.println("5. Cari Lagu");
			System.out.println("6. Keluar");
			
			do {
			System.out.print("\nPilihan : ");
			
			pilihan_2002 = input_2002.nextInt();
			input_2002.nextLine();

			switch (pilihan_2002) {

			case 1:
				System.out.print("Judul Lagu : ");
				String judul_2002 = input_2002.nextLine();

				System.out.print("Penyanyi : ");
				String penyanyi_2002 = input_2002.nextLine();

				playlist_2002.tambahLagu_2002(judul_2002, penyanyi_2002);
				break;

			case 2:
				playlist_2002.hapusLaguAwal_2002();
				break;

			case 3:
				playlist_2002.tampilMaju_2002();
				break;

			case 4:
				playlist_2002.tampilMundur_2002();
				break;

			case 5:
				System.out.print("Masukkan judul lagu yang dicari : ");
				String cari_2002 = input_2002.nextLine();

				playlist_2002.cariLagu_2002(cari_2002);
				break;

			case 6:
				System.out.println("Program selesai.");
				break;

			default:
				System.out.println("Pilihan tidak valid!");
			}

		} while (pilihan_2002 != 6);

		input_2002.close();
	}
}