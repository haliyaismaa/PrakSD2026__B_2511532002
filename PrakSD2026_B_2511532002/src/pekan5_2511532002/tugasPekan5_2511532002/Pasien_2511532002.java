package tugasPekan5_2511532002;

public class Pasien_2511532002 {
	String namaPasien_2002;
	String penyakit_2002;
	int nomorAntrian_2002;
	Pasien_2511532002 next_2002;

    //Konstruktor
	public Pasien_2511532002(String namaPasien_2002, String penyakit_2002, int nomorAntrian) {
		this.namaPasien_2002=namaPasien_2002;
		this.penyakit_2002=penyakit_2002;
		this.nomorAntrian_2002=nomorAntrian;
		this.next_2002=null;
	}
}