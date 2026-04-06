package pekan2_2511532002;

import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511532002 {
	
	//1.Methode untuk menampilkan menu
	public static void tampilkanMenu() {
		System.out.println("\nMenu");
		System.out.println("1. Tambah Mahasiswa");
		System.out.println("2. Tampilkan Semua Mahasiswa");
		System.out.println("3. Hapus Mahasiswa berdasarkan NIM");
		System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	// 2. Methode untuk tambah Mahasiswa
	public static void tambahMahasiswa(ArrayList <Mahasiswa_2511532002> list, Scanner sc) {
		System.out.println("Masukan NIM: ");
		String nim=sc.nextLine();
		System.out.println("Masukan Nama: ");
		String nama=sc.nextLine();
		System.out.println("Masukan Prodi: ");
		String prodi=sc.nextLine();
		list.add(new Mahasiswa_2511532002 (nim, nama, prodi));
		System.out.println("Mahasiswa berhasil ditambahkan!");
	}
}
