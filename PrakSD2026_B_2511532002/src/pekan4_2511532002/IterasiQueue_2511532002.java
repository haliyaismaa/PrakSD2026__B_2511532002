package pekan4_2511532002;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class IterasiQueue_2511532002 {

	public static void main(String[] args) {
		Queue<String> q_2002=new LinkedList<>();
		
		q_2002.add("Praktikum");
		q_2002.add("Struktur");
		q_2002.add("Data");
		q_2002.add("Dan");
		q_2002.add("Algoritma");
		Iterator<String> iterator_2002 = q_2002.iterator();
		while (iterator_2002.hasNext()) {
			System.out.print(iterator_2002.next()+ " ");
		}
	}
}