package tugasPekan6_2511532002;

public class Musik_2511532002 {
	Lagu_2511532002 head_2002;
	Lagu_2511532002 tail_2002;
	
	//method tambah lagu di akhir
	public void tambahLagu_2002(String judul_2002, String penyanyi_2002) {
		Lagu_2511532002 laguBaru_2002 = new Lagu_2511532002(judul_2002, penyanyi_2002);
		
		//Jika playlist kosong
		if (head_2002 == null) {
			head_2002 = laguBaru_2002;
			tail_2002 = laguBaru_2002;
		} else {
			tail_2002.next_2002 = laguBaru_2002;
			laguBaru_2002.prev_2002 = tail_2002;
			tail_2002 = laguBaru_2002;
		}
		
		System.out.println("Lagu berhasil ditambahkan!");
	}
	
	//Methode hapu lagu di awal
	public void hapusLaguAwal_2002() {
		if (head_2002==null) {
			System.out.println("Playlist Kosong!");
			return;
		}
		
		System.out.println("Lagu \"" +head_2002.judul_2002+"\" berhasil dihapus.");
		head_2002 = head_2002.next_2002;
		
		if (head_2002 != null) {
			head_2002.prev_2002 = null;
		} else {
			tail_2002 = null;
		}
	}
	
	//Method tampil maju
	public void tampilMaju_2002() {
		if (head_2002 == null) {
			System.out.println("Playlist kosong!");
			return;
		}
		
		Lagu_2511532002 curr_2002 = head_2002;
		System.out.println("\n=== Playlist Maju ===");
		
		while (curr_2002 != null) {
			System.out.println("Judul : " + curr_2002.judul_2002);
			System.out.println("Penyanyi : " + curr_2002.penyanyi_2002);
			System.out.println();
			
			curr_2002 = curr_2002.next_2002;
		}
	}
		
		//Method tampil mundur
		public void tampilMundur_2002() {
			if (tail_2002 == null) {
				System.out.println("Playlist kosong!");
				return;
			}
			
			Lagu_2511532002 curr_2002 = tail_2002;
			
			System.out.println("\n=== Playlist Mundur ===");
			
			while (curr_2002 != null) {
				System.out.println("Judul : " + curr_2002.judul_2002);
				System.out.println("Penyanyi : " + curr_2002.penyanyi_2002);
				System.out.println();
				
				curr_2002 = curr_2002.prev_2002;
			}
		}
		//Method cari lagu
		public void cariLagu_2002(String judul_2002) {
			if (head_2002 == null) {
				System.out.println("Playlist kosong!");
				return;
			}
			
			Lagu_2511532002 curr_2002 = head_2002;
			boolean ketemu_2002 = false;
			
			while (curr_2002 != null) {
				if (curr_2002.judul_2002.equalsIgnoreCase(judul_2002)) {
					System.out.println("Lagu ditemukan!");
					System.out.println("Judul : " + curr_2002.judul_2002);
					System.out.println("Penyanyi : " + curr_2002.penyanyi_2002);
					ketemu_2002 = true;
					break;
				}
				
				curr_2002 = curr_2002.next_2002;
			}
			
			if (!ketemu_2002) {
				System.out.println("Lagu tidak ditemukan!");
			}
		}
}