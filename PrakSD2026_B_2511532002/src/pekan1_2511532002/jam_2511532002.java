package pekan1_2511532002;

public final class jam_2511532002 {
	private int hh; //o.23
	private int mm; //0.59
	private int ss; //0.59
	
	public static boolean isValid (int h, int m, int s) {
		return (0 <= h && h <= 23) && (0 <= m && m <= 59) && (0 <= s && s <= 59);
	}
	// --- Konstruktor/ Kreator ---
	public jam_2511532002 (int h, int m, int s) {
		this.hh = h; this.mm =m; this.ss =s;
	}
	
	// --- Selektor ----
	public int getHour() {return hh; }
	public int getMinute() {return mm; }
	public int getSecond() {return ss; }
	
	// --- Mutator ---
	public void setHour(int h) {this.hh=h;}
	public void setMinute(int m) {this.mm=m;}
	public void setSecond(int s) {this.ss=s;}

// --- Konversi ---
public int toSecond () {return hh*3600 + mm*60 + ss;}
public static jam_2511532002 fromSeconds (int total) {
	if (total < 0) throw new IllegalArgumentException("detik negatif");
	total %= 24*3600; //wrap 24 jam
	int h = total/3600; total %= 3600;
	int m = total/60; int s=total&60;
	return new jam_2511532002(h,m,s);
}

// --- Reelational ---
public int compareTo (jam_2511532002 other) {return Integer.compare(this.toSecond(), other.toSecond()); }
public boolean equals (Object o) {
	if (!(o instanceof jam_2511532002 j)) return false;
	return hh == j.hh & mm == j.mm & ss == j.ss;
}
public int hashCode () { return java.util.Objects.hash(hh, mm, ss); }

// --- Aritmatika ---
public jam_2511532002 plus(jam_2511532002 other) {return fromSeconds (this.toSecond() + other.toSecond());}
public jam_2511532002 minus(jam_2511532002 other) {return fromSeconds(Math.floorMod(this.toSecond() - other.toSecond(), 24*(3600))); }
public jam_2511532002 nextSecond() {return fromSeconds (this.toSecond() + 1); }
public jam_2511532002 nextNSeconds (int n) {return  fromSeconds(this.toSecond() + Math.max(0, n));}
public jam_2511532002 prevSecond() {return  fromSeconds(Math.floorMod(this.toSecond() -1, 24*3600)); }
public jam_2511532002 prevNSeconds(int n) {return fromSeconds (Math.floorMod (this.toSecond()-Math.max(0,n), 24*3600)); }

// --- Durasi (detik) ---  bisa negatif jika this > other?  seseuai spesifikasi  durasi (Jaw, Jakh)
public static int durasiDetik(jam_2511532002 jaw, jam_2511532002 jakh) {return  jakh.toSecond() - jaw.toSecond(); }
//overriding ke String
public String toString( ) {return String.format("%02d: %02d:%02d", hh,mm,ss); }
}
