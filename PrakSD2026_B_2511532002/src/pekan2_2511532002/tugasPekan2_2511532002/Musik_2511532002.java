package tugasPekan2_2511532002;

public class Musik_2511532002 {
	private String judul_2511532002;
	private String penyanyi_2511532002;
	private int durasi_2511532002;
	
	//Konstruktor
	public Musik_2511532002(String judul, String penyanyi, int durasi) {
		this.judul_2511532002=judul;
		this.penyanyi_2511532002=penyanyi;
		this.durasi_2511532002=durasi;
	}
	
	//Getter
	public String getJudul_2511532002() {
		return judul_2511532002;
	}
	public String getPenyanyi_2511532002() {
		return penyanyi_2511532002;
	}
	public int getDurasi_2511532002() {
		return durasi_2511532002;
	}
	
	//Setter
	public void setJudul_2511532002(String judul) {
		this.judul_2511532002=judul;
	}
	public void setPenyanyi_2511532002 (String penyanyi){
		this.penyanyi_2511532002=penyanyi;
	}
	public void setDurasi_2511532002 (int durasi) {
		this.durasi_2511532002=durasi;		
	}
	
	//Methode menampilkan lagu
	public void tampil_2511532002(){
        System.out.println(judul_2511532002 + " - " + penyanyi_2511532002 + " (" + durasi_2511532002 + " detik)");
    }
}