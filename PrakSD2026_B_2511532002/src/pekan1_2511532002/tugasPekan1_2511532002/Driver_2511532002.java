package tugasPekan1_2511532002;

public class Driver_2511532002 {

	public static void main(String[] args) {
		ADTMobil_2511532002.tambahMobil(
				new ADTMobil_2511532002("BYD  ",2025,1500,250000000,"BYD"));
		ADTMobil_2511532002.tambahMobil(
				new ADTMobil_2511532002("Macan",2023,2300,450000000,"Porshe"));
		ADTMobil_2511532002.tambahMobil(
				new ADTMobil_2511532002("Brio ",2021,1500,200000000,"Mitsubishi"));
		
		System.out.println(" ----- DAFTAR MOBIL -----");
		ADTMobil_2511532002.tampilSemua();
		
		ADTMobil_2511532002.hapusMobil(1);
		
		System.out.println("\n ----- Setelah Dihapus -----");
		ADTMobil_2511532002.tampilSemua();
	}
}	
