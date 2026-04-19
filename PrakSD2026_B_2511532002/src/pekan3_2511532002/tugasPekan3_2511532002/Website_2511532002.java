package tugasPekan3_2511532002;

public class Website_2511532002 {
	private String judul_2511532002;
	private String url_2511532002;
	
	//Konstruktor
	public Website_2511532002(String judul, String url) {
		this.judul_2511532002=judul;
		this.url_2511532002=url;
	}
	
	//Getter
	public String  getJudul_2511532002() {
		return judul_2511532002;
	}
	
	public String  getUrl_2511532002() {
		return url_2511532002;
	}
	
	//Setter
	public void setJudul_2511532002(String judul) {
		this.judul_2511532002=judul;
	}
	
	public void setUrl_2511532002(String url) {
		this.url_2511532002=url;
	}
	
	//Methode Tampil
	public void tampil_2511532002() {
		System.out.println(judul_2511532002+" ("+url_2511532002+" )");
	}
	
}
