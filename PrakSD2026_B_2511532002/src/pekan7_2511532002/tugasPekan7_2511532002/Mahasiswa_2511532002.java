package tugasPekan7_2511532002;

public class Mahasiswa_2511532002 {
	private String nama_2002;
	private String nim_2002;
	private String prodi_2002;
	
	//Konstruktor
	public Mahasiswa_2511532002 (String nama_2002, String nim_2002, String prodi_2002) {
	this.nama_2002=nama_2002;
	this.nim_2002=nim_2002;
	this.prodi_2002=prodi_2002;	}
	
	//getter
	public String getNama_2002() {
		return nama_2002;
	}
	public String getNim_2002() {
		return nim_2002;
	}
	public String getProdi() {
		return prodi_2002;
	}
	
	//setter
	public void setNama_2002(String nama_2002) {
		this.nama_2002=nama_2002;
	}
	public void setNim_2002(String nim_2002) {
		this.nim_2002=nim_2002;
	}
	public void setProdi_2002(String prodi_2002) {
		this.prodi_2002=prodi_2002;
	}
	
	@Override
	public String toString() {
		return nama_2002+" - "+nim_2002+" - "+prodi_2002;
	}
	}
