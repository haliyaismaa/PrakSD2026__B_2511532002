package tugasPekan4_2511532002;
import java.util.Scanner;
public class AntrianLoket_2511532002 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Queue_2511532002 antrian = new Queue_2511532002(10);
		
		int pilihan_2002=0;
		
			System.out.println("=== PROGRAM ANTRIAN LOKET ===");
			System.out.println("\n1. Tambah Antrian");
			System.out.println("2. Hapus Antrian");
			System.out.println("3. Tampilkan Antrian");
			System.out.println("4. Reverse");
			System.out.println("5. Keluar");
			
		while (pilihan_2002 != 5){
			System.out.print("\nPilih menu: ");
			pilihan_2002=input.nextInt();
			input.nextLine();
			
		if (pilihan_2002 ==1) {
			System.out.print("Masukkan Nama Pelanggan : ");
			String nama=input.nextLine();
			antrian.enqueue_2002(nama);
			
		}else if (pilihan_2002 == 2) {
			antrian.dequeue_2002();
		}else if (pilihan_2002 == 3) {
			antrian.tampil_2002();
		}else if (pilihan_2002==4) {
			antrian.reverse();
			antrian.tampil_2002();
		}else if (pilihan_2002==5) {
			System.out.println("Program Selesai!");
		}else {
			System.out.println("Pilihan Tidak Valid!");
		}
		}
		input.close();
	}
}