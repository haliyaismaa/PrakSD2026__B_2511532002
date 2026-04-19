package tugasPekan3_2511532002;

import java.util.Scanner;
import java.util.Stack;

public class Browser_2511532002 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    Stack<Website_2511532002> history_2511532002 = new Stack<>();

	    int pilihan_2511532002 = 0;

	    while (pilihan_2511532002 != 4) {

	   System.out.println("\n=== Browser History NIM: 2511532002 ===");
	   System.out.println("1. Kunjungi Website (Push)");
	   System.out.println("2. Tombol Back (Pop)");
	   System.out.println("3. Lihat Halaman Aktif (Peek)");
	   System.out.println("4. Keluar");

	   System.out.print("Pilihan: ");
	   pilihan_2511532002 = input.nextInt();
	   input.nextLine();
	   
	   //push (1)
	   if (pilihan_2511532002 == 1) {
		   System.out.print("Masukkan Judul : ");
		   String judul = input.nextLine();
		   
		   System.out.print("Masukkan URL : ");
		   String url=input.nextLine();
		   
		   Website_2511532002 web = new Website_2511532002 (judul, url);
		   history_2511532002.push(web);
		   
		   System.out.println("Berhasil mengunjungi halaman!");
		   
		   //pop (2)
	   }else if (pilihan_2511532002 == 2) {
		   if (history_2511532002.isEmpty()) {
			   System.out.println("History Kosong!");
		   }else {
			   Website_2511532002 hapus_2511532002 = history_2511532002.pop();
			   System.out.println("Halaman dihapus!");
			   hapus_2511532002.tampil_2511532002();
		   }
		   
		   //peek (3)
	   }else if (pilihan_2511532002 == 3) {
		   if (history_2511532002.isEmpty()) {
			   System.out.println("Tidak ada halaman aktif!");
		   }else {
			   System.out.println("Halaman saat ini : ");
			   history_2511532002.peek().tampil_2511532002();
		   }
		   
		   //keluar (4)
	   }else if (pilihan_2511532002 == 4) {
		   System.out.println("Terima kasih!");
	   }else {
		   System.out.println("Pilihan tidak valid!");
	   }
	    } input.close();
	}
}