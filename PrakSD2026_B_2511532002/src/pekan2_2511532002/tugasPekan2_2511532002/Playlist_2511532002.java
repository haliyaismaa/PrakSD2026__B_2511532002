package tugasPekan2_2511532002;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511532002 {

	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
			ArrayList<Musik_2511532002> playlist_2511532002=new ArrayList<>();
			
			int pilihan_2511532002=0;
			
			while (pilihan_2511532002 !=5) {
				System.out.println("\n ===== Playlist Musik =====");
				System.out.println("1. Tambah Lagu");
				System.out.println("2. Lihat Playlist");
				System.out.println("3. Hapus Lagu");
				System.out.println("4. Keluar");
				
				System.out.print("Pilihan : ");
				pilihan_2511532002 = input.nextInt();
				input.nextLine();
			
				if (pilihan_2511532002 == 1) {
					System.out.print("Masukan Judul : ");
					String judul = input.nextLine();
					
					System.out.print("Masukan Penyanyi : ");
					String penyanyi = input.nextLine();
					
					System.out.print("Masukan Durasi (Detik) : ");
					int durasi = input.nextInt();
					
					Musik_2511532002 lagu_2511532002 = new Musik_2511532002 ( judul, penyanyi,  durasi);
					playlist_2511532002.add(lagu_2511532002);
					
					System.out.println("Lagu berhasil ditambahkan");
					
				} else if (pilihan_2511532002 == 2) {
					if (playlist_2511532002.isEmpty()) {
						System.out.println("Playlist Kosong!");
					}else {
						System.out.println("\n Daftar Lagu : ");
						for (int i=0; i<playlist_2511532002.size(); i++) {
							System.out.print ((i+1) + ". ");
							playlist_2511532002.get(i).tampil_2511532002();
						}
					}
				}else if (pilihan_2511532002==3){
					if (playlist_2511532002.isEmpty()) {
	                    System.out.println("Playlist kosong!");
	                } else {
	                    System.out.print("Masukkan nomor lagu yang ingin dihapus: ");
	                    int index = input.nextInt();

	                    if (index > 0 && index <= playlist_2511532002.size()) {
	                    	playlist_2511532002.remove(index - 1);
	                        System.out.println("Lagu berhasil dihapus!");
	                    } else {
	                        System.out.println("Nomor tidak valid!");
	                    }
	                }
				}else if (pilihan_2511532002 == 4) {
					System.out.println("Total lagu: " + playlist_2511532002.size());
					System.out.println("Terima kasih!");

	            } else {
	                System.out.println("Pilihan tidak valid!");
	            }
	        }
			input.close();
	}
}
			
	
		