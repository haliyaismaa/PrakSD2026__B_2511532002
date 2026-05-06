package tugasPekan5_2511532002;

import java.util.Scanner;

public class RumahSakit_2511532002 {
	Pasien_2511532002 head_2002;
	int counter_2002=0;
	
	//insert
    void insertPasien_2002(String nama_2002, String penyakit_2002) {
        counter_2002++;
        Pasien_2511532002 newNode_2002 = new Pasien_2511532002(nama_2002, penyakit_2002, counter_2002);
        
        if (head_2002 == null) {
            head_2002 = newNode_2002;
        } else {
            Pasien_2511532002 temp_2002 = head_2002;
            while (temp_2002.next_2002 != null) {
                temp_2002 = temp_2002.next_2002;
            }
            temp_2002.next_2002 = newNode_2002;
        }
        System.out.println("Pasien Berhasil Didafarkan!");
        System.out.println("Nomor Antrian: " + counter_2002);
    }
    
    //delete head
    void deleteHead_2002() {
        if (head_2002 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        System.out.println("Memanggil: " + head_2002.namaPasien_2002 +
                " | Keluhan: " + head_2002.penyakit_2002);

        head_2002 = head_2002.next_2002;
    }
    
    //display
    void display_2002() {
        if (head_2002 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        Pasien_2511532002 temp_2002 = head_2002;
        System.out.println("\n=== DAFTAR ANTRIAN ===");

        while (temp_2002 != null) {
            System.out.println("No: " + temp_2002.nomorAntrian_2002 +
                    " | Nama: " + temp_2002.namaPasien_2002 +
                    " | Keluhan: " + temp_2002.penyakit_2002);
            temp_2002 = temp_2002.next_2002;
        }
    }
    
    //search
    void search_2002(String namaCari_2002) {
        Pasien_2511532002 temp_2002 = head_2002;
        boolean ketemu_2002 = false;

        while (temp_2002 != null) {
            if (temp_2002.namaPasien_2002.equalsIgnoreCase(namaCari_2002)) {
                System.out.println("Pasien ditemukan:");
                System.out.println("No: " + temp_2002.nomorAntrian_2002 +
                        " | Nama: " + temp_2002.namaPasien_2002 +
                        " | Keluhan: " + temp_2002.penyakit_2002);
                ketemu_2002 = true;
                break;
            }
            temp_2002 = temp_2002.next_2002;
        }

        if (!ketemu_2002) {
            System.out.println("Pasien tidak ditemukan!");
        }
    }
    
    //sttus
    void status_2002() {
        if (head_2002 == null) {
            System.out.println("Antrian kosong!");
            return;
        }

        int jumlah_2002 = 0;
        Pasien_2511532002 temp_2002 = head_2002;

        while (temp_2002 != null) {
            jumlah_2002++;
            temp_2002 = temp_2002.next_2002;
        }

        System.out.println("Total Pasien: " + jumlah_2002);
        System.out.println("Pasien terdepan: " + head_2002.namaPasien_2002);
    }

    //Main Program
	public static void main(String[] args) {
		Scanner input_2002=new Scanner(System.in);
		RumahSakit_2511532002 rs_2002=new RumahSakit_2511532002();
		
		int pilihan_2002=0;
		
		System.out.println("\n ===== ANTRIAN RUMAH SAKIT NIM: 2511532002 =====");
		System.out.println("1. Daftarkan Pasien (Insert)");
		System.out.println("2. Panggil Pasien (Delete Head)");
		System.out.println("3. Tampilkan Antrian (Display)");
		System.out.println("4. Cari Pasien (Search)");
		System.out.println("5. Cek Status Antrian");
		System.out.println("6. Keluar");
		
		while (pilihan_2002 !=6) {

			System.out.print("\n Pilihan: ");
			
			pilihan_2002=input_2002.nextInt();
			input_2002.nextLine();
			
			switch (pilihan_2002) {
			case 1:
				System.out.print("Masukkan Nama Pasien: ");
				String nama_2002 =input_2002.nextLine();
				System.out.print("Masukkan Keluhan: ");
				String keluhan_2002=input_2002.nextLine();
				rs_2002.insertPasien_2002(nama_2002, keluhan_2002);
				break;
				
			case 2:
				rs_2002.deleteHead_2002();
				break;
			
			case 3:
				rs_2002.display_2002();
				break;
				
            case 4:
                System.out.print("Cari nama pasien: ");
                String cari_2002 = input_2002.nextLine();
                rs_2002.search_2002(cari_2002);
                break;

            case 5:
                rs_2002.status_2002();
                break;

            case 6:
                System.out.println("Program selesai.");
                break;

            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    input_2002.close();
	}
}

