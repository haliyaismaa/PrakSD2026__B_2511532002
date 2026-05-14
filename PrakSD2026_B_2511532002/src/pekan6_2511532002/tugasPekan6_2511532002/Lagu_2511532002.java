package tugasPekan6_2511532002;

public class Lagu_2511532002 {
	String judul_2002;
	String penyanyi_2002;
	
	Lagu_2511532002 next_2002;
	Lagu_2511532002 prev_2002;
	
	//Konstruktor
	public Lagu_2511532002(String judul_2002, String penyanyi_2002) {
		this.judul_2002=judul_2002;
		this.penyanyi_2002=penyanyi_2002;
		this.next_2002=null;
		this.prev_2002=null;
	}
	
	//getter
	public String getJudul_2002() {
		return judul_2002;
	}
	public String getPenyanyi_2002() {
		return penyanyi_2002;
	}
	
	//setter
	public void setJudul_2002(String judul_2002) {
		this.judul_2002=judul_2002;
	}
	public void setPenyani_2002(String penyanyi_2002) {
		this.penyanyi_2002=penyanyi_2002;
	}
}