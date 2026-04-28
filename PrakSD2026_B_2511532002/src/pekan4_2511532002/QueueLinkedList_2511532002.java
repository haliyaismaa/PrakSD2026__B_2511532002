package pekan4_2511532002;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511532002 {

	public static void main(String[] args) {
		Queue<Integer> q_2002=new LinkedList<>();
		
		//tambah elemen ke Antrian
		for (int i=0; i<6; i++)
			q_2002.add(i);
		
		//Menampilkan isi Antrian
		System.out.println("\nElemen Antrian "+q_2002);
		
		//Menghapus Head Antrian
		int hapus_2002=q_2002.remove();
		System.out.println("\nHapus Elemen = "+hapus_2002);
		System.out.println(q_2002);
		
		//Untuk melihat Antrian depan
		int depan_2002=q_2002.peek();
		System.out.println("\nKepala Antrian = "+depan_2002);
		
		//Menampilkan banyak data
		int banyak_2002= q_2002.size();
		System.out.println("\nSize Antrian = "+ banyak_2002);
	}

}
