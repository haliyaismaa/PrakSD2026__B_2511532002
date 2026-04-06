package tugasPekan1_2511532002;

public class ADTMobil_2511532002 {
	private String nama;
	private int tahun;
	private int cc;
	private double harga;
	private String merek;
	
	//Konstruktor
	public ADTMobil_2511532002(String nama, int tahun, int cc, double harga, String merek) {
		this.nama=nama;
		this.tahun=tahun;
		this.cc=cc;
		this.harga=harga;
		this.merek=merek;
	}
	
	//Getter
	public String getNama() {return nama;}
	
	//Setter
	public void setNama(String nama) {this.nama=nama;}
	
	//methode
	public void tampil() {
        System.out.println(nama + " | " + tahun + " | " + cc + "cc | " + harga + " | " + merek);
    }
	
	//Array
	public static ADTMobil_2511532002[] data=new ADTMobil_2511532002[10];
	public static int n=0;
	
	public static void tambahMobil(ADTMobil_2511532002 m) {
		if (n<data.length) {
			data[n]=m;
			n++;
		}else {
			System.out.println("Data Penuh!");
		}
	}
	
	public static void hapusMobil(int index) {
        if (index >= 0 && index < n) {
            for (int i= index; i < n-1; i++) {
                data[i] = data[i+1];
            }
            n--;
        } else {
            System.out.println("Index tidak valid!");
        }
	}
	
	 public static void tampilSemua() {
	        for (int i = 0; i < n; i++) {
	            data[i].tampil();
	        }
	 }
}
